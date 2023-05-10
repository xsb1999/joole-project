package com.example.jooleproject.service;

import com.example.jooleproject.entity.Product;
import com.example.jooleproject.entity.ProjectProduct;

import java.util.List;

public interface IProjectProductService {
    String addProjectProduct(int projectId, int productId);
    String deleteProjectProduct(int projectId, int productId);
    List<ProjectProduct> getProjectProductByProjectId(int projectId);
    List<Product> getProductsByProjectId(int projectId);
}
