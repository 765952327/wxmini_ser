package com.tree.wxmini.response;

public class ResponseState {
    private  int code;
    private  String name;
    private  String desc;

    public ResponseState(int code, String name, String desc){
        this.code = code;
        this.name = name;
        this.desc = desc;
    }
    public ResponseState(int code,String name){
        this.code = code;
        this.name = name;
    }
    public ResponseState(int code){
        this.code = code;
    }
    public ResponseState(){
        this.code = 200;
        this.name = "service";
        this.desc = "default";
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
