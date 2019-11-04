package com.fancyliu.learningspringboot.controller;

import com.fancyliu.learningspringboot.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public User getUser() {
        User user = new User();
        user.setAge(18);
        user.setName("zhangsan");
        user.setPass("123456");
        return user;

    }

    @RequestMapping(value = "/getUsers", method = RequestMethod.POST)
    public List<User> getUsers() {
        List<User> list = new ArrayList<>();

        User user1 = new User();
        user1.setAge(18);
        user1.setName("zhangsan");
        user1.setPass("123456");
        list.add(user1);

        User user2 = new User();
        user2.setAge(20);
        user2.setName("lisi");
        user2.setPass("111111");
        list.add(user2);

        return list;
    }
}
