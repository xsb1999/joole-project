package com.example.jooleproject.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @Column(name = "manufacturer", nullable = true, length = 100)
    private String manufacturer;
    @Basic
    @Column(name = "series", nullable = true, length = 100)
    private String series;
    @Basic
    @Column(name = "model", nullable = true, length = 100)
    private String model;
    @OneToOne
    @JoinColumn(name = "product_id")
    @JsonBackReference
    private Product product;

    public int getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(int descriptionId) {
        this.descriptionId = descriptionId;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Description{" +
                "descriptionId=" + descriptionId +
                ", manufacturer='" + manufacturer + '\'' +
                ", series='" + series + '\'' +
                ", model='" + model + '\'' +
                ", product=" + product +
                '}';
    }
}
