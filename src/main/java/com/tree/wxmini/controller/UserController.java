package com.tree.wxmini.controller;

import com.tree.wxmini.model.TbUser;
import com.tree.wxmini.request.CreateUser;
import com.tree.wxmini.response.ResponseState;
import com.tree.wxmini.service.UserService;
import javafx.beans.binding.ObjectExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/user.add")
    public String addUser(CreateUser createUser){
        TbUser user = new TbUser();
        System.out.println(createUser.getOpenId());
        user.setOpenId(createUser.getOpenId());
        String result = userService.createUser(user);
        if (result.equals("0")){
            return "Failure to create user";
        }else {
            return result;
        }
    }

    @RequestMapping("/user.search")
    public TbUser searchUser(String uid){
        return userService.selectUserByUserID(uid);
    }
}
