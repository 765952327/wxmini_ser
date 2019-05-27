package com.tree.wxmini.controller;

import com.tree.wxmini.response.ResponseState;
import org.springframework.web.bind.annotation.RequestMapping;

public class LoginController {

    @RequestMapping("/login.do")
    public Object login(){

//        TODO:用户登录 成功code为200 失败code为500
        return new ResponseState();
    }



}
