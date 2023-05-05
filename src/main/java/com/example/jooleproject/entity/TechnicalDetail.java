package com.example.jooleproject.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "technical_detail", schema = "joole", catalog = "")
public class TechnicalDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "technical_detail_id", nullable = false)
    private int technicalDetailId;
//    @Basic
//    @Column(name = "product_id", nullable = true)
//    private Integer productId;
    @Basic
    @Column(name = "airflow", nullable = true)
    private Integer airflow;
    @Basic
    @Column(name = "power", nullable = true)
    private Integer power;
    @Basic
    @Column(name = "operating_voltage", nullable = true)
    private Integer operatingVoltage;
    @Basic
    @Column(name = "fan_speed", nullable = true)
    private Integer fanSpeed;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public int getTechnicalDetailId() {
        return technicalDetailId;
    }

    public void setTechnicalDetailId(int technicalDetailId) {
        this.technicalDetailId = technicalDetailId;
    }

    public Integer getAirflow() {
        return airflow;
    }

    public void setAirflow(Integer airflow) {
        this.airflow = airflow;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getOperatingVoltage() {
        return operatingVoltage;
    }

    public void setOperatingVoltage(Integer operatingVoltage) {
        this.operatingVoltage = operatingVoltage;
    }

    public Integer getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(Integer fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "TechnicalDetail{" +
                "technicalDetailId=" + technicalDetailId +
                ", airflow=" + airflow +
                ", power=" + power +
                ", operatingVoltage=" + operatingVoltage +
                ", fanSpeed=" + fanSpeed +
                ", product=" + product +
                '}';
    }
}
