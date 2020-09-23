package com.zdb.demo.mapper;

import org.apache.ibatis.annotations.Param;
import com.zdb.demo.entity.User;
import com.zdb.demo.entity.UserExample;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     *  根据指定的条件获取数据库记录数,user
     *
     * @param example
     */
    int countByExample(UserExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,user
     *
     * @param example
     */
    int deleteByExample(UserExample example);

    /**
     *  根据主键删除数据库的记录,user
     *
     * @param userId
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     *  新写入数据库记录,user
     *
     * @param record
     */
    int insert(User record);

    /**
     *  动态字段,写入数据库记录,user
     *
     * @param record
     */
    int insertSelective(User record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,user
     *
     * @param example
     */
    List<User> selectByExample(UserExample example);

    /**
     *  根据指定主键获取一条数据库记录,user
     *
     * @param userId
     */
    User selectByPrimaryKey(Integer userId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,user
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,user
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,user
     *
     * @param record
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *  根据主键来更新符合条件的数据库记录,user
     *
     * @param record
     */
    int updateByPrimaryKey(User record);

    /**
     * 根据用户名获取user信息
     * @param uid
     * @return
     */
    User findByUid(String uid);

    /**
     * 获取user列表
     * @param map
     * @return
     */
    List<User> getUserList(Map<String, Object> map);
}