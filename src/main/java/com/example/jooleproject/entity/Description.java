package com.example.jooleproject.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "description", schema = "joole", catalog = "")
public class Description implements Serializable {
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "description_id", nullable = false)
    private int descriptionId;
    @Basic
    @Column(name = "product_id", nullable = true)
    private Integer productId;
    @Basic
    @Column(name = "manufacturer", nullable = true, length = 100)
    private String manufacturer;
    @Basic
    @Column(name = "series", nullable = true, length = 100)
    private String series;
    @Basic
    @Column(name = "model", nullable = true, length = 100)
    private String model;

    public int getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(int descriptionId) {
        this.descriptionId = descriptionId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Description{" +
                "descriptionId=" + descriptionId +
                ", productId=" + productId +
                ", manufacturer='" + manufacturer + '\'' +
                ", series='" + series + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
