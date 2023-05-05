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
    private String productBrand;
    @Basic
    @Column(name = "certification", nullable = true)
    private String certification;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    private TechnicalDetail technicalDetail;

//    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
//    private Description description;
//
//    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
//    private ProductType productType;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productBrand='" + productBrand + '\'' +
                ", certification='" + certification + '\'' +
                ", technicalDetail=" + technicalDetail +
                '}';
    }
}
