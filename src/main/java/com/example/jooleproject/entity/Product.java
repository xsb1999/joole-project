package com.example.jooleproject.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "joole", catalog = "")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_id", nullable = false)
    private int productId;
    @Basic
    @Column(name = "product_type_id", nullable = true)
    private Integer productTypeId;
    @Basic
    @Column(name = "technical_detail_id", nullable = true)
    private Integer technicalDetailId;
    @Basic
    @Column(name = "description_id", nullable = true)
    private Integer descriptionId;
    @Basic
    @Column(name = "product_brand", nullable = true)
    private Object productBrand;
    @Basic
    @Column(name = "certification", nullable = true)
    private Object certification;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public Integer getTechnicalDetailId() {
        return technicalDetailId;
    }

    public void setTechnicalDetailId(Integer technicalDetailId) {
        this.technicalDetailId = technicalDetailId;
    }

    public Integer getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(Integer descriptionId) {
        this.descriptionId = descriptionId;
    }

    public Object getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(Object productBrand) {
        this.productBrand = productBrand;
    }

    public Object getCertification() {
        return certification;
    }

    public void setCertification(Object certification) {
        this.certification = certification;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productTypeId=" + productTypeId +
                ", technicalDetailId=" + technicalDetailId +
                ", descriptionId=" + descriptionId +
                ", productBrand=" + productBrand +
                ", certification=" + certification +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Objects.equals(productTypeId, product.productTypeId) && Objects.equals(technicalDetailId, product.technicalDetailId) && Objects.equals(descriptionId, product.descriptionId) && Objects.equals(productBrand, product.productBrand) && Objects.equals(certification, product.certification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productTypeId, technicalDetailId, descriptionId, productBrand, certification);
    }
}
