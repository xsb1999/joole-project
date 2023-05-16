package com.example.jooleproject;

import com.example.jooleproject.entity.*;
import com.example.jooleproject.repository.*;
import com.example.jooleproject.service.IProjectService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

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
    @Autowired
    private DescriptionRepository descriptionRepository;
    @Autowired
    private IProjectService iProjectService;

    @Test
    void testProjectDelete() {

//        iProjectService.deleteProject(15);

    }
    @Test
    void testDescription() {
        List<Product> productList = descriptionRepository.searchProductAdvanceDescription("a","b",null);
        for(Product p: productList){
            System.out.println(p.getProductId());
        }
    }

    @Test
    void testTechnicalDetailAndProduct() {
        Product product = new Product();
        product.setProductBrand("NP666");

        TechnicalDetail technicalDetail = new TechnicalDetail();
        technicalDetail.setFanSpeed(888);

        product.setTechnicalDetail(technicalDetail);
        technicalDetail.setProduct(product);

        productRepository.save(product);

//        productRepository.deleteById(4);

    }

    @Test
    void testProjectUser() {
        User user = userRepository.findByUserName("Anna");
        List<Project> projectList = user.getProjectList();
        Project project = new Project();
        project.setUser(user);
        projectList.add(project);
        user.setProjectList(projectList);
        projectRepository.save(project);
    }

    @Test
    void testDeleteProjectAndProductRelation() {
//        Product product = productRepository.findByProductId(23);
//        product.setProjects(new HashSet<Project>());
//        productRepository.save(product);
//        projectRepository.deleteById(31);
    }

    @Test
    void testProjectProduct() {
//        User user = new User();
//        user.setUserName("Spark");
//        User user = userRepository.findByUserName("Andy");
//        List<Project> projectList = user.getProjectList();
        Project project = new Project();
        Product product = new Product();
        product.setProductBrand("NY");


//        project.setUser(user);
//        projectList.add(project);
//        user.setProjectList(projectList);
//        userRepository.save(user);
        projectRepository.save(project);
//        productRepository.save(product);
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
