package com.tree.wxmini.dao;

import com.tree.wxmini.model.TbContentReply;

public interface TbContentReplyMapper {
    int deleteByPrimaryKey(String coid);

    int insert(TbContentReply record);

    int insertSelective(TbContentReply record);

    TbContentReply selectByPrimaryKey(String coid);

    int updateByPrimaryKeySelective(TbContentReply record);

    int updateByPrimaryKeyWithBLOBs(TbContentReply record);

    int updateByPrimaryKey(TbContentReply record);
}