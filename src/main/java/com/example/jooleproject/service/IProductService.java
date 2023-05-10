package com.example.jooleproject.service;

import com.example.jooleproject.entity.Product;
import com.example.jooleproject.entity.TechnicalDetail;

public interface IProductService {
    String addProduct(Product product);
    String deleteProduct(int productId);
    TechnicalDetail getTechnicalDetailByProductId(int productId);
}
