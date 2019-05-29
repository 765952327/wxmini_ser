package com.tree.wxmini.model;

import java.util.Date;

public class TbContent {
    private String cid;

    private String uid;

    private Integer userMood;

    private Boolean userAnonymous;

    private Date createTime;

    private String contentText;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Integer getUserMood() {
        return userMood;
    }

    public void setUserMood(Integer userMood) {
        this.userMood = userMood;
    }

    public Boolean getUserAnonymous() {
        return userAnonymous;
    }

    public void setUserAnonymous(Boolean userAnonymous) {
        this.userAnonymous = userAnonymous;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText == null ? null : contentText.trim();
    }
}