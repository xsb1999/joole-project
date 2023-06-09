package com.example.jooleproject.repository;

import com.example.jooleproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, String> {
    User findByUserName(String username);
    List<User> findByUserType(String usertype);
}
