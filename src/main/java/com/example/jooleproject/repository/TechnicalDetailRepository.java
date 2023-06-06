package com.example.jooleproject.repository;

import com.example.jooleproject.entity.Product;
import com.example.jooleproject.entity.Project;
import com.example.jooleproject.entity.TechnicalDetail;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TechnicalDetailRepository extends CrudRepository<TechnicalDetail, Integer> {
    TechnicalDetail findByProduct(Product product);
    @Query(value = "select t.product from TechnicalDetail t where (?1 is null or t.airflow = ?1) and (?2 is null or t.power = ?2) and (?3 is null or t.operatingVoltage = ?3) and (?4 is null or t.fanSpeed = ?4)")
    List<Product> searchProductAdvanceTechnicalDetail(Integer airflow, Integer power, Integer operatingVoltage, Integer fanSpeed);
}
