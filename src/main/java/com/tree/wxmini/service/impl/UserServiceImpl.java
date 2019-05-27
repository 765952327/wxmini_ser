package com.tree.wxmini.service.impl;


import com.tree.wxmini.dao.TbUserMapper;
import com.tree.wxmini.model.TbUser;
import com.tree.wxmini.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

//import org.apache.log4j.Logger;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    TbUserMapper userDao;
    private  static Logger log = Logger.getLogger(UserService.class);

    @Override
    public List<TbUser> queryUser() {
        log.info("<<<查询所有用户<<<");
       return userDao.queryUser();
    }

    @Override
    public TbUser selectUserByUserID(String userId) {
        log.info("<<<通过USERID查询<<<"+userId);
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public TbUser selectUserByOpenID(String openId) {
        log.info("<<<通过OPENID查询<<<"+openId);
        return userDao.selectUserByOpenID(openId);
    }

    @Override
    public String createUser(TbUser user) {
        TbUser userTemp = userDao.selectUserByOpenID(user.getOpenId());
        if(userTemp == null){
            TbUser tbUser = new TbUser();
            tbUser.setUid(UUID.randomUUID().toString().replaceAll("-",""));
            tbUser.setOpenId(user.getOpenId());
//            userDao.insert(tbUser);
            int result = userDao.insert(tbUser);
            return tbUser.getUid();
        }else {
            log.info("User : OpenID:"+user.getOpenId()+"<<<用户已存在");
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
