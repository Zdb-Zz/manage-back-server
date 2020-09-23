package com.zdb.demo.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zdb.demo.entity.User;
import com.zdb.demo.mapper.UserMapper;
import com.zdb.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User findByUid(String uid) {
        return userMapper.findByUid(uid);
    }

    @Override
    public Page<User> getUserList(Integer pageIndex, Integer pageSize, Integer sex, String username) {
        Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("sex", sex);
        Page page = PageHelper.startPage(pageIndex, pageSize);
        Page<User> users = (Page<User>) userMapper.getUserList(map);
        return users;
    }

    @Override
    public Boolean updateUser(User user) {
        return 1 == userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public Boolean deleteUser(Integer userId) {
        return 1 == userMapper.deleteByPrimaryKey(userId);
    }

}
