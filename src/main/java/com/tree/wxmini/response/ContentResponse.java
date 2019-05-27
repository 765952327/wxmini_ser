package com.tree.wxmini.response;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContentResponse {
    private String cid;
    private String uid;
    private Integer mood;
    private Integer type;
    private String text;
    private String time;

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

    public Integer getMood() {
        return mood;
    }

    public void setMood(Integer mood) {
        this.mood = mood;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(Date time) {
        SimpleDateFormat sf  = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        this.time = sf.format(time);
    }
}
