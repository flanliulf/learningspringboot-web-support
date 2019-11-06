package com.fancyliu.learningspringboot.service.impl;

import com.fancyliu.learningspringboot.model.User;
import com.fancyliu.learningspringboot.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Service("userService")
public class InMemoryUserServiceImpl implements UserService {

    private static AtomicInteger counter = new AtomicInteger();
    private final ConcurrentHashMap<Integer, User> users = new ConcurrentHashMap<>();

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>(this.users.values());
        return userList;
    }

    @Override
    public User save(User user) {
        Integer id = user.getId();
        if (id == null || id == 0) {
            id = counter.incrementAndGet();
            user.setId(id);
        }
        this.users.put(id, user);
        return user;
    }

    @Override
    public User update(User user) {
        this.users.put(user.getId(), user);
        return user;
    }

    @Override
    public User updateName(User user) {
        User u = this.users.get(user.getId());
        u.setName(user.getName());
        this.users.put(u.getId(), u);
        return u;
    }

    @Override
    public User findById(Integer id) {
        return this.users.get(id);
    }

    @Override
    public void deleteById(Integer id) {
        this.users.remove(id);
    }
}
