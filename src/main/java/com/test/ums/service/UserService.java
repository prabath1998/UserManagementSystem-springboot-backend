package com.test.ums.service;

import com.test.ums.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();
}
