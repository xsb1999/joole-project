package com.example.jooleproject.service;

import com.example.jooleproject.entity.User;

import java.util.List;

public interface IUserService {
    List<User> findAllUser();
    User findUserByUserName(String username);
    String addUser(User user);
    String deleteUser(String username);
    String updateUser(User user);
}
