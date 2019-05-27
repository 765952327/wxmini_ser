package com.tree.wxmini.response;

public class LoginResponse {
    public LoginResponse(String userId){
        this.setUserId(userId);
    }
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
