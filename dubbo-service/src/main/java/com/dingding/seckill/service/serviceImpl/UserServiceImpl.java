package com.dingding.seckill.service.serviceImpl;

import com.dingding.seckill.dao.UserMapper;
import com.dingding.seckill.user.User;
import com.dingding.seckill.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-08-21
 */
@Service
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
        System.out.println("service" + user);
        return userMapper.updateUser(user);
    }
}
