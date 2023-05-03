package com.example.jooleproject.entity;

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
    @Basic
    @Column(name = "project_id", nullable = true)
    private Integer projectId;
    @Basic
    @Column(name = "product_id", nullable = true)
    private Integer productId;

    public int getProjectProductId() {
        return projectProductId;
    }

    public void setProjectProductId(int projectProductId) {
        this.projectProductId = projectProductId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }


    @Override
    public String toString() {
        return "ProjectProduct{" +
                "projectProductId=" + projectProductId +
                ", projectId=" + projectId +
                ", productId=" + productId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectProduct that = (ProjectProduct) o;
        return projectProductId == that.projectProductId && Objects.equals(projectId, that.projectId) && Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectProductId, projectId, productId);
    }
}
