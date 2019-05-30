package com.tree.wxmini.controller;

import com.tree.wxmini.model.TbContent;
import com.tree.wxmini.request.Comment;
import com.tree.wxmini.request.ContentModel;
import com.tree.wxmini.response.ContentResponse;
import com.tree.wxmini.response.ResponseState;
import com.tree.wxmini.service.ContentService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class ContentController {

    @Autowired
    ContentService contentService;
    @RequestMapping("/content.add")
    public Object addContent(@Param("uid")String uid, @Param("text")String text, @Param("mood")int mood, @Param("type")Boolean type){
//        TODO:增加一条内容
        if(uid.isEmpty()||text.isEmpty()){
            return new ResponseState(500);
        }else {
            TbContent content =new TbContent();
            content.setUid(uid);
            content.setCid(UUID.randomUUID().toString().replaceAll("-",""));
            content.setContentText(text);
            content.setUserMood(mood);
            content.setUserAnonymous(type);
            content.setCreateTime(new Date());
            contentService.addContent(content);
        }

        return new ResponseState();
    }

    @RequestMapping("/content.query")
    public List<ContentResponse> contentQuery(@Param("page") int page){
        List<ContentResponse> contentResponseList = contentService.queryContent(page);
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

    @RequestMapping("/comment.query")
    public List<Comment> queryComment(@Param("cid") String cid){
        //TODO:列出评论
        List<Comment> commentList = new ArrayList<>();
        return commentList;
    }

}
