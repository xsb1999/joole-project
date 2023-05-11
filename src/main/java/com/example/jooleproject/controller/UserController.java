package com.example.jooleproject.controller;

import com.example.jooleproject.entity.User;
import com.example.jooleproject.service.IUserService;
import com.example.jooleproject.service.impl.UserDetailService;
import com.example.jooleproject.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @Autowired
    private UserDetailService userDetailService;
    @Autowired
    private JwtUtil jwtUtilToken;
    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody User user) throws Exception{
        String username = user.getUserName();
        String password = user.getUserPassword();
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        }
        catch (BadCredentialsException e){
            throw new Exception("Incorrect username or password", e);
        }

        final UserDetails userDetails = userDetailService.loadUserByUsername(username);
        final String jwt = jwtUtilToken.generateToken(userDetails);
        return new ResponseEntity<>(jwt, HttpStatus.OK);
    }

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
