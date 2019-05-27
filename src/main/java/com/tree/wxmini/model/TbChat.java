package com.tree.wxmini.model;

import java.util.Date;

public class TbChat {
    private Integer chid;

    private String uid;

    private String toUid;

    private String chatText;

    private Integer chatType;

    private Integer chatState;

    private Date createTime;

    public Integer getChid() {
        return chid;
    }

    public void setChid(Integer chid) {
        this.chid = chid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getToUid() {
        return toUid;
    }

    public void setToUid(String toUid) {
        this.toUid = toUid == null ? null : toUid.trim();
    }

    public String getChatText() {
        return chatText;
    }

    public void setChatText(String chatText) {
        this.chatText = chatText == null ? null : chatText.trim();
    }

    public Integer getChatType() {
        return chatType;
    }

    public void setChatType(Integer chatType) {
        this.chatType = chatType;
    }

    public Integer getChatState() {
        return chatState;
    }

    public void setChatState(Integer chatState) {
        this.chatState = chatState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}