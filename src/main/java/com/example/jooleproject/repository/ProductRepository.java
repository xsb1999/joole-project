package com.example.jooleproject.repository;

import com.example.jooleproject.entity.Description;
import com.example.jooleproject.entity.Product;
import com.example.jooleproject.entity.ProductType;
import com.example.jooleproject.entity.TechnicalDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByProductId(int id);
    @Query(value = "select p from Product p where p.productBrand like %?1%")
    List<Product> findByProductBrandLike(String brand);
}
