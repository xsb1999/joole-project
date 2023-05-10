package com.example.jooleproject.service;

import com.example.jooleproject.entity.Project;
import com.example.jooleproject.entity.User;

import java.util.List;

public interface IProjectService {
    String addProject(String username);
    String deleteProject(int projectId);
    List<Project> findProjectsbyUserName(String username);
    // change the user of a project
    String updateProject(int projectId, String username);
}
