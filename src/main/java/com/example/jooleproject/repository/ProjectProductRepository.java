package com.example.jooleproject.repository;

import com.example.jooleproject.entity.Product;
import com.example.jooleproject.entity.Project;
import com.example.jooleproject.entity.ProjectProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProjectProductRepository extends JpaRepository<ProjectProduct, Integer> {
    List<ProjectProduct> findByProject(Project project);
    List<ProjectProduct> findByProjectAndProduct(Project project, Product product);
}
