package com.dingding.seckill;

import com.dingding.seckill.user.User;

import java.util.List;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-08-26
 */
public interface UserService {
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
    User queryUserById(Integer id);
    /**
     * 根据id进行删除
     * @param id
     * @return
     */
    int deleteUserById( Integer id);

    /**
     * 增加用户
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 更新用户
     * @param user
     * @param id
     * @return
     */
    int updateUser(User user, Integer id);
}