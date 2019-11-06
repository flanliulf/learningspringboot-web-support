package com.fancyliu.learningspringboot.controller;

import com.fancyliu.learningspringboot.model.User;
import com.fancyliu.learningspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("user")
    public User add(User user) {
        User result = this.userService.save(user);
        return result;
    }

    @PutMapping("user")
    public User update(User user) {
        User result = this.userService.update(user);
        return result;
    }

    @PatchMapping("user/name")
    public User updateName(User user) {
        User result = this.userService.updateName(user);
        return result;
    }

    @DeleteMapping("user/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.userService.deleteById(id);
        return "success";
    }

    @GetMapping("user/{id}")
    public User find(@PathVariable("id") Integer id) {
        User user = this.userService.findById(id);
        return user;
    }

    @GetMapping("users")
    public List<User> list() {
        List<User> users = this.userService.findAll();
        return users;
    }
}
