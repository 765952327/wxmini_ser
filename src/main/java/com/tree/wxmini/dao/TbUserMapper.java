package com.tree.wxmini.dao;

import com.tree.wxmini.model.TbUser;

import java.util.List;

public interface TbUserMapper {
    int deleteByPrimaryKey(String uid);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    List<TbUser> queryUser();

    TbUser selectByPrimaryKey(String uid);

    TbUser selectUserByOpenID(String openid);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}