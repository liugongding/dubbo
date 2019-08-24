package com.dingding.seckill.dao;

import com.dingding.seckill.test.TestApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-08-21
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
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
    public void deleteUserById() {
    }

    @Test
    public void insertUser() {

    }

    @Test
    public void updateUser() {
    }
}