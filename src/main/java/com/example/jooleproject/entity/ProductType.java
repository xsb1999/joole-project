package com.example.jooleproject.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "product_type", schema = "joole", catalog = "")
public class ProductType implements Serializable {
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_type_id", nullable = false)
    private int productTypeId;
    @Basic
    @Column(name = "product_id", nullable = true)
    private Integer productId;
    @Basic
    @Column(name = "application", nullable = true, length = 100)
    private String application;
    @Basic
    @Column(name = "type", nullable = true, length = 50)
    private String type;
    @Basic
    @Column(name = "mounting_location", nullable = true, length = 100)
    private String mountingLocation;
    @Basic
    @Column(name = "accessories", nullable = true, length = 100)
    private String accessories;
    @Basic
    @Column(name = "model_year", nullable = true)
    private Date modelYear;

    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMountingLocation() {
        return mountingLocation;
    }

    public void setMountingLocation(String mountingLocation) {
        this.mountingLocation = mountingLocation;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public Date getModelYear() {
        return modelYear;
    }

    public void setModelYear(Date modelYear) {
        this.modelYear = modelYear;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "productTypeId=" + productTypeId +
                ", productId=" + productId +
                ", application='" + application + '\'' +
                ", type='" + type + '\'' +
                ", mountingLocation='" + mountingLocation + '\'' +
                ", accessories='" + accessories + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }
}
