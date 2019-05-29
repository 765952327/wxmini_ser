package com.tree.wxmini.service.impl;


import com.tree.wxmini.dao.TbUserMapper;
import com.tree.wxmini.dao.TbUserinfoMapper;
import com.tree.wxmini.model.TbUser;
import com.tree.wxmini.model.TbUserinfo;
import com.tree.wxmini.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//import org.apache.log4j.Logger;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    TbUserMapper userDao;
    @Autowired
    TbUserinfoMapper userinfoMapper;

    @Override
    public List<TbUser> queryUser() {

       return userDao.queryUser();
    }

    @Override
    public TbUser selectUserByUserID(String userId) {

        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public TbUser selectUserByOpenID(String openId) {

        return userDao.selectUserByOpenID(openId);
    }

    @Override
    public String createUser(TbUser user, TbUserinfo userinfo) {
        TbUser userTemp = userDao.selectUserByOpenID(user.getOpenId());
        if(userTemp == null){
//            userDao.insert(tbUser);
            int result = userDao.insert(user);
            int res = userinfoMapper.insert(userinfo);
            return user.getUid();
        }else {

        }
        return "0";
    }

    @Override
    public int updateUser(TbUser user) {
        return userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public int deleteUser(String userId) {
        if(userDao.selectByPrimaryKey(userId)==null){
        }else {
            return 1;
        }
        return 0;
    }
}
