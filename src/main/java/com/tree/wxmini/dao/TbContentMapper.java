package com.tree.wxmini.dao;

import com.tree.wxmini.model.TbContent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentMapper {

    List<TbContent> queryContent(@Param(value="x") Integer x);

    int deleteByPrimaryKey(String cid);

    int insert(TbContent record);

    int insertSelective(TbContent record);

    TbContent selectByPrimaryKey(String cid);

    int updateByPrimaryKeySelective(TbContent record);

    int updateByPrimaryKeyWithBLOBs(TbContent record);

    int updateByPrimaryKey(TbContent record);
}