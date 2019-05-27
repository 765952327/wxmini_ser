package com.tree.wxmini.dao;

import com.tree.wxmini.model.UserSession;

public interface UserSessionMapper {
    int deleteByPrimaryKey(String openId);

    int insert(UserSession record);

    int insertSelective(UserSession record);

    UserSession selectByPrimaryKey(String openId);

    int updateByPrimaryKeySelective(UserSession record);

    int updateByPrimaryKey(UserSession record);
}