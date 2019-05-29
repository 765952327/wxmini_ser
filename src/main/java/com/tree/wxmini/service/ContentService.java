package com.tree.wxmini.service;

import com.tree.wxmini.model.TbContent;
import com.tree.wxmini.request.ContentModel;

import java.util.List;

public interface ContentService {
    List<ContentModel> queryContent(int page);
    List<ContentModel> queryContentByUID(String UID);
    int addContent(TbContent content);

}
