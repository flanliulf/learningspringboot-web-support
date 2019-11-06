package com.fancyliu.learningspringboot.service;

import com.fancyliu.learningspringboot.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User save(User user);

    User update(User user);

    User updateName(User user);

    User findById(Integer id);

    void deleteById(Integer id);
}
