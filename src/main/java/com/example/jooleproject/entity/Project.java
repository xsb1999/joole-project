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
    @ManyToOne
    @JoinColumn(name = "user_name")
    private User user;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", user=" + user +
                '}';
    }
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Project project = (Project) o;
//        return projectId == project.projectId && Objects.equals(userName, project.userName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(projectId, userName);
//    }
}
