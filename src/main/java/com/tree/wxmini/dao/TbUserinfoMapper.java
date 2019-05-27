package com.tree.wxmini.dao;

import com.tree.wxmini.model.TbUserinfo;

public interface TbUserinfoMapper {
    int deleteByPrimaryKey(String uid);

    int insert(TbUserinfo record);

    int insertSelective(TbUserinfo record);

    TbUserinfo selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(TbUserinfo record);

    int updateByPrimaryKeyWithBLOBs(TbUserinfo record);

    int updateByPrimaryKey(TbUserinfo record);
}