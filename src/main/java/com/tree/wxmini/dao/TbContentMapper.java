package com.tree.wxmini.dao;

import com.tree.wxmini.model.TbContent;

public interface TbContentMapper {
    int deleteByPrimaryKey(String cid);

    int insert(TbContent record);

    int insertSelective(TbContent record);

    TbContent selectByPrimaryKey(String cid);

    int updateByPrimaryKeySelective(TbContent record);

    int updateByPrimaryKeyWithBLOBs(TbContent record);

    int updateByPrimaryKey(TbContent record);
}