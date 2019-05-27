package com.tree.wxmini.service.impl;

import com.tree.wxmini.dao.UserSessionMapper;
import com.tree.wxmini.model.UserSession;
import com.tree.wxmini.response.WxSession;
import com.tree.wxmini.service.LoginService;
import com.tree.wxmini.utils.HttpClientUtil;
import com.tree.wxmini.utils.JsonUtils;
//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.HashMap;
import java.util.Map;

public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserSessionMapper userSessionMapper;


    private String wxResult;

    @Value("${WX_CODE2SESSION_URL}")
    private String WX_CODE2SESSION_URL;
    @Value("${WX_APPID}")
    private String WX_APPID;
    @Value("${WX_SECRET}")
    private String WX_SECRET;
    @Value("${GRANT_TYPE}")
    private String GRANT_TYPE;
    @Value("${WX_SESSION_TIMEOUT}")
    private Long WX_SESSION_TIMEOUT;

    public WxSession wxLogin(String code){
        Map<String,String> param = new HashMap<>();
        param.put("appid",WX_APPID);
        param.put("secret",WX_SECRET);
        param.put("js_code",code);
        param.put("grant_type",GRANT_TYPE);
        wxResult = HttpClientUtil.doGet(WX_CODE2SESSION_URL,param);
        WxSession wxSession = JsonUtils.jsonToPojo(wxResult,WxSession.class);
        if(wxSession == null){
            return null;
        }
        UserSession userSession = userSessionMapper.selectByPrimaryKey(wxSession.getOpenid());



        if (userSession == null){
            UserSession session = new UserSession();
            session.setSessionKey(wxSession.getSession_key());
            session.setOpenId(wxSession.getOpenid());
            userSessionMapper.insert(session);
        }else {
            userSession.setOpenId(wxSession.getOpenid());
            userSession.setSessionKey(wxSession.getSession_key());
            userSessionMapper.updateByPrimaryKey(userSession);
        }
        return wxSession;
    }
}
