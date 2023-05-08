package com.example.jooleproject.controller;

import com.example.jooleproject.entity.User;
import com.example.jooleproject.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/findAllUser")
    public List<User> findAllUser(){
        return iUserService.findAllUser();
    }

    @GetMapping("/findUserByUserName")
    public User findUserByUserName(@RequestParam String username){
        return iUserService.findUserByUserName(username);
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        String msg="";
        try {
            msg = iUserService.addUser(user);
        }
        catch (Exception exception){
            msg = "System error, please contact administrator...";
            System.err.println(exception);
        }
        return msg;
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestParam String username){
        String msg="";
        try {
            msg = iUserService.deleteUser(username);
        }
        catch (Exception exception){
            msg = "System error, please contact administrator...";
            System.err.println(exception);
        }
        return msg;
    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestBody User user){
        String msg="";
        try {
            msg = iUserService.updateUser(user);
        }
        catch (Exception exception){
            msg = "System error, please contact administrator...";
            System.err.println(exception);
        }
        return msg;
    }

}
