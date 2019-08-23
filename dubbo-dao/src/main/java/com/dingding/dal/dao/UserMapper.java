package com.dingding.dal.dao;

import com.dingding.entity.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-08-21
 */
@Mapper
public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<User> queryUserAll();

    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    User queryUserById(@Param("id") Integer id);

    /**
     * 根据id进行删除
     * @param id
     * @return
     */
    int deleteUserById(@Param("id") Integer id);

    /**
     * 增加用户
     * @param list
     * @return
     */
    int insertUser(@Param("list") List<User> list);

    /**
     * 更新用户
     * @param user
     * @return
     */
    int updateUser(User user);
}
