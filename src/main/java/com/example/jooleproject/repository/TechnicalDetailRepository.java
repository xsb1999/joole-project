package com.example.jooleproject.repository;

import com.example.jooleproject.entity.Project;
import com.example.jooleproject.entity.TechnicalDetail;
import org.springframework.data.repository.CrudRepository;

public interface TechnicalDetailRepository extends CrudRepository<TechnicalDetail, Integer> {
    
}
