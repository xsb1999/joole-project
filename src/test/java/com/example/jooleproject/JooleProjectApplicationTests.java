package com.example.jooleproject;

import com.example.jooleproject.dao.UserRepository;
import com.example.jooleproject.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

class JooleProjectApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testDb() {
        User user1 = new User();
        user1.setUserName("Andy1");
        user1.setUserType("a");
        user1.setUserPassword("123456-1");
        User user2 = new User();
        user2.setUserName("Andy2");
        user2.setUserType("a");
        user2.setUserPassword("123456-2");
        User user3 = new User();
        user3.setUserName("Andy3");
        user3.setUserType("b");
        user3.setUserPassword("123456-3");
        User user4 = new User();
        user4.setUserName("Andy4");
        user4.setUserType("b");
        user4.setUserPassword("123456-4");
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);

        System.out.println("Users found with findAll()");
        System.out.println("------------------------------");
        for(User user: userRepository.findAll()){
            System.out.println(user.toString());
        }
        System.out.println("Users found with findByUserName()");
        System.out.println("------------------------------");
        System.out.println(userRepository.findByUserName("Andy1").toString());
        System.out.println("Users found with findByUserType()");
        System.out.println("------------------------------");
        for(User user: userRepository.findByUserType("b")){
            System.out.println(user.toString());
        }
    }
}
