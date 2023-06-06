package com.example.jooleproject.repository;

import com.example.jooleproject.entity.Product;
import com.example.jooleproject.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {
    ProductType findByProduct(Product product);
    @Query(value = "select pt.product from ProductType pt where (?1 is null or pt.application = ?1) and (?2 is null or pt.type = ?2) and (?3 is null or pt.mountingLocation = ?3) and (?4 is null or pt.accessories = ?4) and (?5 is null or pt.modelYear = ?5)")
    List<Product> searchProductAdvanceProductType(String application, String type, String mountingLocation, String accessories, Date modelYear);
}
