package com.tree.wxmini.service.impl;

import com.tree.wxmini.dao.TbContentMapper;
import com.tree.wxmini.model.TbContent;
import com.tree.wxmini.request.ContentModel;
import com.tree.wxmini.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    TbContentMapper contentMapper;
    @Override
    public List<ContentModel> queryContent(int page) {
            List<TbContent> tbContents = contentMapper.queryContent(page);
            return getContentResponses(tbContents);
        }

    private List<ContentModel> getContentResponses(List<TbContent> tbContents) {
        return null;
    }



    @Override
    public List<ContentModel> queryContentByUID(String UID) {
        return null;
    }

    @Override
    public int addContent(TbContent content) {
        return contentMapper.insertSelective(content);
    }
}
