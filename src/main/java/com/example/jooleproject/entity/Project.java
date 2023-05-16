package com.example.jooleproject.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "project", schema = "joole", catalog = "")
public class Project implements Serializable {
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "project_id", nullable = false)
    private int projectId;
    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_name")
    @JsonBackReference
    private User user;

    @OneToMany(mappedBy="project", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
//    @JsonManagedReference
    private Set<ProjectProduct> projectProducts;

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

    public Set<ProjectProduct> getProjectProducts() {
        return projectProducts;
    }

    public void setProjectProducts(Set<ProjectProduct> projectProducts) {
        this.projectProducts = projectProducts;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", user=" + user +
                ", projectProducts=" + projectProducts +
                '}';
    }
}
