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
    @Basic
    @Column(name = "product_id", nullable = true)
    private Integer productId;
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

    public int getTechnicalDetailId() {
        return technicalDetailId;
    }

    public void setTechnicalDetailId(int technicalDetailId) {
        this.technicalDetailId = technicalDetailId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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

    @Override
    public String toString() {
        return "TechnicalDetail{" +
                "technicalDetailId=" + technicalDetailId +
                ", productId=" + productId +
                ", airflow=" + airflow +
                ", power=" + power +
                ", operatingVoltage=" + operatingVoltage +
                ", fanSpeed=" + fanSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TechnicalDetail that = (TechnicalDetail) o;
        return technicalDetailId == that.technicalDetailId && Objects.equals(productId, that.productId) && Objects.equals(airflow, that.airflow) && Objects.equals(power, that.power) && Objects.equals(operatingVoltage, that.operatingVoltage) && Objects.equals(fanSpeed, that.fanSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(technicalDetailId, productId, airflow, power, operatingVoltage, fanSpeed);
    }
}
