package com.zdb.demo.controller;

import com.github.pagehelper.Page;
import com.zdb.demo.entity.User;
import com.zdb.demo.service.UserService;
import com.zdb.demo.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Slf4j
@Scope("prototype")
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    /**
     * 登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    public Map<String,Object> login(@RequestBody User user){
        User myUser = userService.findByUid(user.getUid());
        if(myUser!=null && user.getPassword().equals(myUser.getPassword())){
            return ResultUtil.resultSuccess("注册成功", null, myUser);
        }else{
            return ResultUtil.resultFail("注册失败", null, null);
        }
    }

    /**
     * 获取用户列表
     * @param pageIndex
     * @param pageSize
     * @param sex
     * @param username
     * @return
     */
    @GetMapping("/getUserList")
    public Map<String,Object> getUserList(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                          @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                          @RequestParam(value = "sex",required = false) Integer sex,
                                          @RequestParam(value = "username",required = false) String  username
                                          ){
        Page<User> users = userService.getUserList(pageIndex,pageSize,sex,username);
        if(users!=null && users.size()>0){
            return ResultUtil.listResult(users.getPageNum(),users.getPageSize(), (int) users.getTotal(),users.getResult());
        }else{
            return ResultUtil.resultFail("获取列表失败", null, null);
        }
    }

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    @PostMapping("/updateUser")
    public Map<String,Object> updateUser(@RequestBody User user){
        Boolean isSuccess = userService.updateUser(user);
        if(isSuccess){
            return ResultUtil.resultSuccess("修改成功", null, null);
        }else{
            return ResultUtil.resultFail("修改成功", null, null);
        }
    }

    /**
     * 删除用户信息
     * @param userId
     * @return
     */
    @GetMapping("/deleteUser")
    public Map<String,Object> deleteUser(@RequestParam("userId") Integer userId){
        Boolean isSuccess = userService.deleteUser(userId);
        if(isSuccess){
            return ResultUtil.resultSuccess("删除成功", null, null);
        }else{
            return ResultUtil.resultFail("删除失败", null, null);
        }
    }

}
