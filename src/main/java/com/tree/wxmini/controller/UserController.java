package com.tree.wxmini.controller;

import com.tree.wxmini.response.ResponseState;
import javafx.beans.binding.ObjectExpression;
import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {

    @RequestMapping("/user.add")
    public Object addUser(){
        //    TODO:新增用户 成功code为200 失败为500
        return new ResponseState();
    }

    @RequestMapping("/user.search")
    public Object searchUser(){
//        TODO:验证用户是否存在 如果存在code 为200 不存在为400
        return new ResponseState();
    }
}
