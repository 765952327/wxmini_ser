package com.tree.wxmini.dao;

import com.tree.wxmini.model.TbUser;

public interface TbUserMapper {
    int deleteByPrimaryKey(String uid);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}