package com.example.jooleproject.dao;

import com.example.jooleproject.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {
    User findByUserName(String username);
    List<User> findByUserType(String usertype);
}
