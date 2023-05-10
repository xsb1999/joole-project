package com.example.jooleproject.repository;

import com.example.jooleproject.entity.Project;
import com.example.jooleproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    List<Project> findProjectByUser(User user);
    Project findByProjectId(int id);

}
