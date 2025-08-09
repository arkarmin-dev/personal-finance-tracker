package com.akm.finance.services;

import com.akm.finance.entities.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    List<User> getAllUsers();
}
