package com.tree.wxmini.model;

import java.util.Date;

public class TbContentReply {
    private String coid;

    private String uid;

    private String cid;

    private String replyUid;

    private String rCoid;

    private Date createTime;

    private String replyText;

    public String getCoid() {
        return coid;
    }

    public void setCoid(String coid) {
        this.coid = coid == null ? null : coid.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getReplyUid() {
        return replyUid;
    }

    public void setReplyUid(String replyUid) {
        this.replyUid = replyUid == null ? null : replyUid.trim();
    }

    public String getrCoid() {
        return rCoid;
    }

    public void setrCoid(String rCoid) {
        this.rCoid = rCoid == null ? null : rCoid.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getReplyText() {
        return replyText;
    }

    public void setReplyText(String replyText) {
        this.replyText = replyText == null ? null : replyText.trim();
    }
}