package com.example.jooleproject.service.impl;

import com.example.jooleproject.entity.Product;
import com.example.jooleproject.entity.Project;
import com.example.jooleproject.entity.ProjectProduct;
import com.example.jooleproject.repository.ProductRepository;
import com.example.jooleproject.repository.ProjectProductRepository;
import com.example.jooleproject.repository.ProjectRepository;
import com.example.jooleproject.service.IProjectProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class ProjectProductServiceImpl implements IProjectProductService {
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    ProjectProductRepository projectProductRepository;

    @Override
    public String addProjectProduct(int projectId, int productId) {
        String msg = "add success!";
        try {
            Project project = projectRepository.findByProjectId(projectId);
            Product product = productRepository.findByProductId(productId);
            ProjectProduct projectProduct = new ProjectProduct();
            projectProduct.setProject(project);
            projectProduct.setProduct(product);
            Set<ProjectProduct> set1 = project.getProjectProducts();
            Set<ProjectProduct> set2 = product.getProjectProducts();
            set1.add(projectProduct);
            set2.add(projectProduct);
            project.setProjectProducts(set1);
            product.setProjectProducts(set2);
            projectRepository.save(project);
            productRepository.save(product);
            projectProductRepository.save(projectProduct);
        }catch (Exception e){
            msg = "add failed!";
            throw e;
        }
        return msg;
    }

    @Override
    public String deleteProjectProduct(int projectId, int productId) {
        String msg = "delete success!";
        try {
            Project project = projectRepository.findByProjectId(projectId);
            Product product = productRepository.findByProductId(productId);
            ProjectProduct projectProduct = projectProductRepository.findByProjectAndProduct(project, product).get(0);
            Set<ProjectProduct> set1 = project.getProjectProducts();
            Set<ProjectProduct> set2 = product.getProjectProducts();
            set1.remove(projectProduct);
            set2.remove(projectProduct);
            project.setProjectProducts(set1);
            product.setProjectProducts(set2);
            projectRepository.save(project);
            productRepository.save(product);
            projectProductRepository.deleteById(projectProduct.getProjectProductId());
        }catch (Exception e){
            msg = "delete failed!";
            throw e;
        }
        return msg;
    }

    @Override
    public List<ProjectProduct> getProjectProductByProjectId(int projectId) {
        Project project = projectRepository.findByProjectId(projectId);
        return projectProductRepository.findByProject(project);
    }

    @Override
    public List<Product> getProductsByProjectId(int projectId) {
        List<ProjectProduct> projectProductList = getProjectProductByProjectId(projectId);
        List<Product> productList = new ArrayList<>();
        for(ProjectProduct p : projectProductList){
            productList.add(p.getProduct());
        }
        return productList;
    }
}
