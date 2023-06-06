package com.example.jooleproject.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @Basic
    @Column(name = "fan_speed_min", nullable = true)
    private Integer fanSpeedMin;
    @Basic
    @Column(name = "power_min", nullable = true)
    private Integer powerMin;
    @Basic
    @Column(name = "operating_voltage_min", nullable = true)
    private Integer operatingVoltageMin;
    @Basic
    @Column(name = "fan_speed_num", nullable = true)
    private Integer fanSpeedNum;
    @Basic
    @Column(name = "sound", nullable = true)
    private Integer sound;
    @Basic
    @Column(name = "diameter", nullable = true)
    private Integer diameter;
    @Basic
    @Column(name = "height", nullable = true)
    private Integer height;
    @Basic
    @Column(name = "height_min", nullable = true)
    private Integer heightMin;
    @Basic
    @Column(name = "weight", nullable = true)
    private Integer weight;

    @OneToOne
    @JoinColumn(name = "product_id")
    @JsonBackReference
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

    public Integer getFanSpeedMin() {
        return fanSpeedMin;
    }

    public void setFanSpeedMin(Integer fanSpeedMin) {
        this.fanSpeedMin = fanSpeedMin;
    }

    public Integer getPowerMin() {
        return powerMin;
    }

    public void setPowerMin(Integer powerMin) {
        this.powerMin = powerMin;
    }

    public Integer getOperatingVoltageMin() {
        return operatingVoltageMin;
    }

    public void setOperatingVoltageMin(Integer operatingVoltageMin) {
        this.operatingVoltageMin = operatingVoltageMin;
    }

    public Integer getFanSpeedNum() {
        return fanSpeedNum;
    }

    public void setFanSpeedNum(Integer fanSpeedNum) {
        this.fanSpeedNum = fanSpeedNum;
    }

    public Integer getSound() {
        return sound;
    }

    public void setSound(Integer sound) {
        this.sound = sound;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getHeightMin() {
        return heightMin;
    }

    public void setHeightMin(Integer heightMin) {
        this.heightMin = heightMin;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "TechnicalDetail{" +
                "technicalDetailId=" + technicalDetailId +
                ", airflow=" + airflow +
                ", power=" + power +
                ", operatingVoltage=" + operatingVoltage +
                ", fanSpeed=" + fanSpeed +
                ", fanSpeedMin=" + fanSpeedMin +
                ", powerMin=" + powerMin +
                ", operatingVoltageMin=" + operatingVoltageMin +
                ", fanSpeedNum=" + fanSpeedNum +
                ", sound=" + sound +
                ", diameter=" + diameter +
                ", height=" + height +
                ", heightMin=" + heightMin +
                ", weight=" + weight +
                ", product=" + product +
                '}';
    }
}
