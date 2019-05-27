package com.tree.wxmini.request;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment {
    private String coid;
    private String uid;
    private String cid;
    private String reply_uid;
    private String reply_text;
    private String r_coid;
    private String create_time;

    public String getCoid() {
        return coid;
    }

    public void setCoid(String coid) {
        this.coid = coid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getReply_uid() {
        return reply_uid;
    }

    public void setReply_uid(String reply_uid) {
        this.reply_uid = reply_uid;
    }

    public String getReply_text() {
        return reply_text;
    }

    public void setReply_text(String reply_text) {
        this.reply_text = reply_text;
    }

    public String getR_coid() {
        return r_coid;
    }

    public void setR_coid(String r_coid) {
        this.r_coid = r_coid;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        SimpleDateFormat sf  = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        this.create_time = sf.format(create_time);
    }
}
