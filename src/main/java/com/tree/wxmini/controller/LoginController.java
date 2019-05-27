package com.tree.wxmini.controller;

import com.tree.wxmini.model.TbUser;
import com.tree.wxmini.request.CreateUser;
import com.tree.wxmini.response.LoginResponse;
import com.tree.wxmini.response.WxSession;
import com.tree.wxmini.service.LoginService;
import com.tree.wxmini.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    UserService userService;
    @Autowired
    UserController userController;
    @Autowired
    LoginService loginService;
    @RequestMapping("/login.do")
    public Object login(@RequestParam("code") String code, HttpServletRequest request){
        WxSession wxSession = loginService.wxLogin(code);
        TbUser user = userService.selectUserByOpenID(wxSession.getOpenid());
        String userId ;
        if (user != null){
            userId = user.getUid();
        }else {
            CreateUser createUser = new CreateUser();
            createUser.setOpenId(wxSession.getOpenid());
            userId = userController.addUser(createUser);
        }
        request.getSession().setAttribute("userId",userId);
        return new LoginResponse(userId);
    }
}




