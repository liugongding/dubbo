package com.dingding.controller;

import com.dingding.entity.user.User;
import com.dingding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-08-22
 */
@RestController
public class UserController {

    @Autowired
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
        System.out.println(id);
        System.out.println(user);
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
