package com.example.jooleproject.service.impl;

import com.example.jooleproject.entity.Project;
import com.example.jooleproject.entity.User;
import com.example.jooleproject.repository.ProjectRepository;
import com.example.jooleproject.repository.UserRepository;
import com.example.jooleproject.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements IProjectService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public String addProject(String username) {
        String msg = "add success!";
        try {
            // find the user by username
            User user = userRepository.findByUserName(username);
            if (user == null){
                return "User doesn't exist!";
            }
            List<Project> list = user.getProjectList();
            Project project = new Project();
            project.setUser(user);
            list.add(project);
            user.setProjectList(list);
            userRepository.save(user);
        }catch (Exception e){
            msg = "add failed";
            throw e;
        }
        return msg;
    }

    @Override
    public String deleteProject(int projectId) {
        String msg = "delete success!";
        try {
            // also need to detach all the related products
            // ...

            projectRepository.deleteById(projectId);
        }catch (Exception e){
            msg = "add failed";
            throw e;
        }
        return msg;
    }

    @Override
    public List<Project> findProjectsbyUserName(String username) {
        User user = userRepository.findByUserName(username);
        return projectRepository.findProjectByUser(user);
    }

    @Override
    public String updateProject(int projectId, String username) {
        String msg = "update success!";
        try {
            User user = userRepository.findByUserName(username);
            List<Project> list = user.getProjectList();
            Project project = projectRepository.getById(projectId);
            project.setUser(user);
            list.add(project);
            user.setProjectList(list);
            userRepository.save(user);
        }catch (Exception e){
            msg = "update failed";
            throw e;
        }
        return msg;
    }


}
