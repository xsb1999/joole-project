package com.example.jooleproject.service.impl;

import com.example.jooleproject.entity.User;
import com.example.jooleproject.repository.UserRepository;
import com.example.jooleproject.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User findUserByUserName(String username) {
        return userRepository.findByUserName(username);
    }

    @Override
    public String addUser(User user) {
        String msg = "add success!";
        try {
            // find if the username has already existed in database
            User user1 = userRepository.findByUserName(user.getUserName());
            if (user1 != null){
                return "This username already exists, please change it!";
            }
            userRepository.save(user);
        }catch (Exception e){
            msg = "add failed!";
            throw e;
        }
        return msg;
    }

    @Override
    public String deleteUser(String username) {
        String msg = "delete success!";
        try {
            userRepository.deleteById(username);
        }catch (Exception e){
            msg = "delete failed!";
            throw e;
        }
        return msg;
    }

    @Override
    public String updateUser(User user) {
        String msg = "update success!";
        try {
            // find if the username existed in database
            User user1 = userRepository.findByUserName(user.getUserName());
            if (user1 == null){
                return "User doesn't exist!";
            }
            userRepository.save(user);
        }catch (Exception e){
            msg = "update failed!";
            throw e;
        }
        return msg;
    }
}
