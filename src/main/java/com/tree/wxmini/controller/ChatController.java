package com.tree.wxmini.controller;

import com.tree.wxmini.response.ResponseState;
import org.springframework.web.bind.annotation.RequestMapping;

public class ChatController {

    @RequestMapping("/chat.do")
    public Object doChat(){
        //    TODO:增加一条聊天记录
        return new ResponseState();
    }
}
