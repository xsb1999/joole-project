package com.example.jooleproject.repository;

import com.example.jooleproject.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {
}
