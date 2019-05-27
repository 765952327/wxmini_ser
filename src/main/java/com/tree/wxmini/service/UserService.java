package com.tree.wxmini.service;

import com.tree.wxmini.model.TbUser;


import java.util.List;

public interface UserService {
    /**
     * 列出所有用户
     * @return List<TbUser>
     */
    List<TbUser> queryUser();

    /**
     * 通过userID 查询用户
     * @param userId
     * @return TbUser
     */
    TbUser selectUserByUserID(String userId);

    /**
     * 通过openID 查询用户
     * @param openId
     * @return
     */
    TbUser selectUserByOpenID(String openId);

    /**
     * 创建一个新用户
     * @param user
     * @return int
     */
    String  createUser(TbUser user);

    /**
     * 更新用户
     * @param user
     * @return int
     */
    int updateUser(TbUser user);

    /**
     * 删除用户
     * @param userId
     * @return int
     */
    int deleteUser(String userId);



}
