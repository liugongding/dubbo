package com.dingding.seckill;

import com.dingding.seckill.dao.UserMapper;
import com.dingding.seckill.user.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 前后端分离的 vue + Springbot
 * @Author liugongding
 * @Date 2019-08-21
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Slf4j
public class UserMapperTest {


    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Test
    public void queryUserAll() {
        System.out.println(userMapper.queryUserAll());
    }

    @Test
    public void queryUserById() {
        Integer id = 24;
        System.out.println(userMapper.queryUserById(id));
    }
    @Test
    public void deleteUserById() {
        Integer id = 22;
        userMapper.deleteUserById(id);
    }

    @Test
    public void insertUser() {
        List<User> list = new ArrayList<>();
        for (int i=0; i<1; i++) {
            User user = new User();
            user.setName("tanglangji"+i);
            user.setAddress("huamao"+i);
//            user.setAge(21+i);
            list.add(user);
        }
        System.out.println(userMapper.insertUser(list));
    }

    @Test
    public void updateUser() {
        Integer id = 27;
        User user = new User();
        user.setId(id);
        user.setAddress("cdd");
        user.setName("liu");
//        user.setAge(999);
        user.setPhone(999L);
        userMapper.updateUser(user);
    }
}