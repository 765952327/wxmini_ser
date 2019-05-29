package com.tree.wxmini.controller;

import com.tree.wxmini.model.TbUser;
import com.tree.wxmini.model.TbUserinfo;
import com.tree.wxmini.response.LoginResponse;
import com.tree.wxmini.response.WxSession;
import com.tree.wxmini.service.LoginService;
import com.tree.wxmini.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.UUID;


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
    public Object login(@RequestParam("code") String code,@Param("userName") String userName,@Param("headPic") String headPic, HttpServletRequest request){
        System.out.println(code);
        WxSession wxSession = loginService.wxLogin(code);
        TbUser user = null;
        try{
            user = userService.selectUserByOpenID(wxSession.getOpenid());
        }catch (Exception e){

        }

        String userId = null;
        if (user != null){
            userId = user.getUid();
        }else {
          TbUser tbUser = new TbUser();
          tbUser.setUid(UUID.randomUUID().toString().replaceAll("-",""));
          tbUser.setOpenId(wxSession.getOpenid());
            TbUserinfo userinfo = new TbUserinfo();
            userinfo.setCreateTime(new Date());
            userinfo.setUid(tbUser.getUid());
            userinfo.setUserHeadpic(headPic);
            userinfo.setUserName(userName);
            userService.createUser(tbUser,userinfo);
        }
        request.getSession().setAttribute("uid",userId);
        return new LoginResponse(userId);
    }
}




