package com.example.jooleproject;

import com.example.jooleproject.entity.*;
import com.example.jooleproject.repository.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

class JooleProjectApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private TechnicalDetailRepository technicalDetailRepository;


    @Test
    void testTechnicalDetailAndProduct() {
        Product product = new Product();
        product.setProductBrand("new product 111");

        TechnicalDetail technicalDetail = new TechnicalDetail();
        technicalDetail.setFanSpeed(88);

        product.setTechnicalDetail(technicalDetail);
        technicalDetail.setProduct(product);

        productRepository.save(product);

//        productRepository.deleteById(4);

    }


    @Test
    void testProduct() {
        Product product = new Product();
        productRepository.save(product);
    }

    @Test
    void testProjectAndUser() {
        Project project1 = new Project();
        User user = new User();
        user.setUserName("Jack");
        List<Project> projects = new ArrayList<>();
        projects.add(project1);
        user.setProjectList(projects);
        project1.setUser(user);
//        projectRepository.save(project1);
        userRepository.save(user);
//        userRepository.deleteById("Jack");
    }

    @Test
    void testDeleteUser() {
        userRepository.deleteById("Jack");
    }

    @Test
    void testDb() {
//        User user1 = new User();
//        user1.setUserName("Andy1");
//        user1.setUserType("a");
//        user1.setUserPassword("123456-1");
//        User user2 = new User();
//        user2.setUserName("Andy2");
//        user2.setUserType("a");
//        user2.setUserPassword("123456-2");
//        User user3 = new User();
//        user3.setUserName("Andy3");
//        user3.setUserType("b");
//        user3.setUserPassword("123456-3");
//        User user4 = new User();
//        user4.setUserName("Andy4");
//        user4.setUserType("b");
//        user4.setUserPassword("123456-4");
//        userRepository.save(user1);
//        userRepository.save(user2);
//        userRepository.save(user3);
//        userRepository.save(user4);

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
