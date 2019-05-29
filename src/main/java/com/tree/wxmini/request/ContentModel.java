package com.tree.wxmini.request;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContentModel {
   private String cid;
   private String uid;
   private int userMood;
   private int userAnonymous;
   private String contentText;
   private String createTime;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getUserMood() {
        return userMood;
    }

    public void setUserMood(int userMood) {
        this.userMood = userMood;
    }

    public int getUserAnonymous() {
        return userAnonymous;
    }

    public void setUserAnonymous(int userAnonymous) {
        this.userAnonymous = userAnonymous;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        SimpleDateFormat sf  = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        this.createTime = sf.format(createTime);
    }
}
