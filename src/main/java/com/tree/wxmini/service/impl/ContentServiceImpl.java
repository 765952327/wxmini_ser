package com.tree.wxmini.service.impl;

import com.tree.wxmini.dao.TbContentMapper;
import com.tree.wxmini.dao.TbUserinfoMapper;
import com.tree.wxmini.model.TbContent;
import com.tree.wxmini.model.TbUserinfo;
import com.tree.wxmini.request.ContentModel;
import com.tree.wxmini.response.ContentResponse;
import com.tree.wxmini.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    TbContentMapper contentMapper;
    @Autowired
    TbUserinfoMapper userinfoMapper;
    @Override
    public List<ContentResponse> queryContent(int page) {
            List<TbContent> tbContents = contentMapper.queryContent(page);
            return getContentResponses(tbContents);
        }

    private List<ContentResponse> getContentResponses(List<TbContent> tbContents) {
        List<ContentResponse> contentModels = new ArrayList<>();
        for (TbContent c:tbContents
             ) {
            ContentResponse contentModel = new ContentResponse();
            TbUserinfo userinfo = userinfoMapper.selectByPrimaryKey(c.getUid());
            contentModel.setCid(c.getCid());
            contentModel.setUid(c.getUid());
            contentModel.setUserMood(c.getUserMood());
            contentModel.setUserAnonymous(c.getUserAnonymous());
            contentModel.setContentText(c.getContentText());
            contentModel.setCreateTime(c.getCreateTime());
            contentModels.add(contentModel);
            contentModel.setHeadPic(userinfo.getUserHeadpic());

        }
        return contentModels;
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
