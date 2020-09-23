package com.zdb.demo.service;

import com.github.pagehelper.Page;
import com.zdb.demo.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 根据用户名获取用户所有信息
     *
     * @param uid
     * @return
     */
    User findByUid(String uid);

    /**
     * 分页查询用户列表
     *
     * @param pageIndex
     * @param pageSize
     * @param sex
     * @param username
     * @return
     */
    Page<User> getUserList(Integer pageIndex, Integer pageSize, Integer sex, String username);

    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    Boolean updateUser(User user);

    /**
     * 删除用户
     *
     * @param userId
     * @return
     */
    Boolean deleteUser(Integer userId);
}
