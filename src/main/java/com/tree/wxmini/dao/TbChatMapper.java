package com.tree.wxmini.dao;

import com.tree.wxmini.model.TbChat;

public interface TbChatMapper {
    int deleteByPrimaryKey(Integer chid);

    int insert(TbChat record);

    int insertSelective(TbChat record);

    TbChat selectByPrimaryKey(Integer chid);

    int updateByPrimaryKeySelective(TbChat record);

    int updateByPrimaryKey(TbChat record);
}