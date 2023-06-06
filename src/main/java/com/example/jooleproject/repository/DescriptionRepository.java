package com.example.jooleproject.repository;

import com.example.jooleproject.entity.Description;
import com.example.jooleproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DescriptionRepository extends JpaRepository<Description, Integer> {
    Description findByProduct(Product product);
    @Query(value = "select d.product from Description d where (?1 is null or d.manufacturer = ?1) and (?2 is null or d.series = ?2) and (?3 is null or d.model = ?3)")
    List<Product> searchProductAdvanceDescription(String manufacturer, String series, String model);
}
