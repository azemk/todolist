package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    public User create (User user);
    public User update (User user);
    public List<User> getAll();
    void delete (Long id);
}
