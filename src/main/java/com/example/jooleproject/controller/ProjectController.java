package com.example.jooleproject.controller;

import com.example.jooleproject.entity.Project;
import com.example.jooleproject.entity.User;
import com.example.jooleproject.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    @Autowired
    private IProjectService iProjectService;

    @GetMapping("/addProject")
    public String addProject(@RequestParam String username){
        String msg="";
        try {
            msg = iProjectService.addProject(username);
        }
        catch (Exception exception){
            msg = "System error, please contact administrator...";
            System.err.println(exception);
        }
        return msg;
    }

    @DeleteMapping("/deleteProject")
    public String deleteProject(@RequestParam int projectId){
        String msg="";
        try {
            msg = iProjectService.deleteProject(projectId);
        }
        catch (Exception exception){
            msg = "System error, please contact administrator...";
            System.err.println(exception);
        }
        return msg;
    }

    @GetMapping("/findProjectbyUserName")
    public List<Project> findProjectbyUserName(@RequestParam String username){
        return iProjectService.findProjectsbyUserName(username);
    }

    @GetMapping("/updateProject")
    public String updateProject(@RequestParam String username, @RequestParam int projectId){
        String msg="";
        try {
            msg = iProjectService.updateProject(projectId, username);
        }
        catch (Exception exception){
            msg = "System error, please contact administrator...";
            System.err.println(exception);
        }
        return msg;
    }

}
