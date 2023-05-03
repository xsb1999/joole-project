package com.example.jooleproject.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "project", schema = "joole", catalog = "")
public class Project implements Serializable {
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "project_id", nullable = false)
    private int projectId;
    @Basic
    @Column(name = "user_name", nullable = true, length = 100)
    private String userName;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Project(String userName) {
        this.userName = userName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return projectId == project.projectId && Objects.equals(userName, project.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, userName);
    }
}
