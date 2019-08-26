package com.dingding.seckill.service.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dingding.seckill.UserService;
import com.dingding.seckill.dao.UserMapper;
import com.dingding.seckill.user.User;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-08-21
 */
@Service
@Slf4j
public class  UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> queryUserAll() {
        return userMapper.queryUserAll();

    }

    @Override
    public User queryUserById(Integer id) {
        return userMapper.queryUserById(id);
    }
    @Override
    public int deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public int insertUser(User user) {
        List<User> list = new ArrayList<>();
        list.add(user);
        return userMapper.insertUser(list);
    }

    @Override
    public int updateUser(User user,Integer id) {
        user.setId(id);
        log.info("User{}", user);
        return userMapper.updateUser(user);
    }
}
