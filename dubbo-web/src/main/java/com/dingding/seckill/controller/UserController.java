package com.dingding.seckill.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dingding.seckill.UserService;
import com.dingding.seckill.user.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-08-22
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("list")
    @CrossOrigin
    public List<User> queryUserAll() {
        return userService.queryUserAll();
    }

    @CrossOrigin
    @GetMapping(value = "/list/{id}")
    public User queryUserById(@PathVariable("id") Integer id) {
        return userService.queryUserById(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    @CrossOrigin
    public String deleteUserById(@PathVariable("id") Integer id) {
        System.out.println(id);
        userService.deleteUserById(id);
        return "删除成功";
    }

    @PutMapping(value = "/update/{id}")
    @CrossOrigin
    public String updateUserById(@RequestBody User user, @PathVariable("id") Integer id) {
        userService.updateUser(user,id);
        return "更新成功";
    }

    @PostMapping("insert")
    @CrossOrigin
    public String insertUser(@RequestBody User user) {
        userService.insertUser(user);
        return "添加成功";
    }
}
