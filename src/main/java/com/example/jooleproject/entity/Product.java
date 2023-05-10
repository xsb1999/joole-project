package com.example.jooleproject.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

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
    private String productBrand;
    @Basic
    @Column(name = "certification", nullable = true)
    private String certification;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private TechnicalDetail technicalDetail;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private Description description;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private ProductType productType;

    @OneToMany(mappedBy="product", cascade = CascadeType.REMOVE)
//    @JsonManagedReference
    private Set<ProjectProduct> projectProducts;

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

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public TechnicalDetail getTechnicalDetail() {
        return technicalDetail;
    }

    public void setTechnicalDetail(TechnicalDetail technicalDetail) {
        this.technicalDetail = technicalDetail;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Set<ProjectProduct> getProjectProducts() {
        return projectProducts;
    }

    public void setProjectProducts(Set<ProjectProduct> projectProducts) {
        this.projectProducts = projectProducts;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productTypeId=" + productTypeId +
                ", technicalDetailId=" + technicalDetailId +
                ", descriptionId=" + descriptionId +
                ", productBrand='" + productBrand + '\'' +
                ", certification='" + certification + '\'' +
                ", technicalDetail=" + technicalDetail +
                ", description=" + description +
                ", productType=" + productType +
                ", projectProducts=" + projectProducts +
                '}';
    }
}
