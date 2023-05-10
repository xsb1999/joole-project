package com.example.jooleproject.service.impl;

import com.example.jooleproject.entity.Product;
import com.example.jooleproject.entity.TechnicalDetail;
import com.example.jooleproject.entity.User;
import com.example.jooleproject.repository.ProductRepository;
import com.example.jooleproject.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public String addProduct(Product product) {
        String msg = "add success!";
        try {
            productRepository.save(product);
        }catch (Exception e){
            msg = "add failed!";
            throw e;
        }
        return msg;
    }

    @Override
    public String deleteProduct(int productId) {
        String msg = "delete success!";
        try {
            productRepository.deleteById(productId);
        }catch (Exception e){
            msg = "delete failed!";
            throw e;
        }
        return msg;
    }

    @Override
    public TechnicalDetail getTechnicalDetailByProductId(int productId) {
        Product product = productRepository.findByProductId(productId);
        if (product == null){
            return null;
        }
        return product.getTechnicalDetail();
    }


}
