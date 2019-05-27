package com.tree.wxmini.controller;

import com.tree.wxmini.request.Comment;
import com.tree.wxmini.response.ContentResponse;
import com.tree.wxmini.response.ResponseState;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/")
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
    public Object addComment(@RequestBody Comment comment){
//        TODO:增加评论
        return new ResponseState();
    }

    @RequestMapping("/content.relpy")
    public Object replyContent(@RequestBody Comment comment){
        //TODO:回复评论
        return new ResponseState();
    }

    @RequestMapping("/content.query")
    public List<Comment> queryComment(@Param("cid") String cid){
        //TODO:列出评论
        List<Comment> commentList = new ArrayList<>();
        return commentList;
    }

}
