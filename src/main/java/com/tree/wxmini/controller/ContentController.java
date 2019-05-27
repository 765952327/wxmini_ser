package com.tree.wxmini.controller;

import com.tree.wxmini.response.ContentResponse;
import com.tree.wxmini.response.ResponseState;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

public class ContentController {
    @RequestMapping("/content.add")
    public Object addContent(@Param("uid")String uid,@Param("text")String text,@Param("mood")int mood,@Param("type")int type){
//        TODO:增加一条内容
        return new ResponseState();
    }

    @RequestMapping("/content.query")
    public List<ContentResponse> contentQuery(@Param("page") int page){
        List<ContentResponse> contentResponseList = new ArrayList<>();
//        TODO:获取列表 分页值为page
        return contentResponseList;
    }

    @RequestMapping("/content.delete")
    public Object deleteContent(@Param("cid") String cid){
//        TODO:删除文章
        return new ResponseState();
    }

    @RequestMapping("/content.comment")
    public Object addComment(){
//        TODO:增加评论
        return new ResponseState();
    }

    @RequestMapping("/content.relpy")
    public Object replyContent(){
        //TODO:回复评论
        return new ResponseState();
    }


}
