package com.example.jooleproject.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "project_product", schema = "joole", catalog = "")
public class ProjectProduct implements Serializable {
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "project_product_id", nullable = false)
    private int projectProductId;
    @ManyToOne(cascade = CascadeType.DETACH)
    @JsonIgnore
    @JoinColumn(name = "project_id")
//    @JsonBackReference
    Project project;
    @ManyToOne(cascade = CascadeType.DETACH)
    @JsonIgnore
    @JoinColumn(name = "product_id")
//    @JsonBackReference
    Product product;

    public int getProjectProductId() {
        return projectProductId;
    }

    public void setProjectProductId(int projectProductId) {
        this.projectProductId = projectProductId;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProjectProduct{" +
                "projectProductId=" + projectProductId +
                ", project=" + project +
                ", product=" + product +
                '}';
    }
}
