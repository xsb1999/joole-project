package com.example.jooleproject.repository;

import com.example.jooleproject.entity.Project;
import com.example.jooleproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
