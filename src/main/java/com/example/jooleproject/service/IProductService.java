package com.example.jooleproject.service;

import com.example.jooleproject.entity.*;

import java.util.List;
import java.util.Set;

public interface IProductService {
    String addProduct(Product product);
    String addProductWithAllInfo(ProductInfo productInfo);
    String deleteProduct(int productId);
    TechnicalDetail getTechnicalDetailByProductId(int productId);
    List<Product> searchProductByBrand(String brand);
    Set<Product> searchProductAdvance(ProductInfo productInfo);
}
