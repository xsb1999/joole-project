package com.example.jooleproject.entity;

import java.sql.Date;

public class ProductInfo {
    private String manufacturer;
    private String series;
    private String model;
    private String application;
    private String type;
    private String mountingLocation;
    private String accessories;
    private Date modelYear;
    private Integer airflow;
    private Integer power;
    private Integer powerMin;
    private Integer operatingVoltage;
    private Integer operatingVoltageMin;
    private Integer fanSpeed;
    private Integer fanSpeedMin;
    private Integer fanSpeedNum;
    private Integer diameter;
    private Integer sound;
    private Integer height;
    private Integer heightMin;
    private Integer weight;
    private String productBrand;
    private String certification;

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

    public Integer getFanSpeedMin() {
        return fanSpeedMin;
    }

    public void setFanSpeedMin(Integer fanSpeedMin) {
        this.fanSpeedMin = fanSpeedMin;
    }

    public Integer getFanSpeedNum() {
        return fanSpeedNum;
    }

    public void setFanSpeedNum(Integer fanSpeedNum) {
        this.fanSpeedNum = fanSpeedNum;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public Integer getSound() {
        return sound;
    }

    public void setSound(Integer sound) {
        this.sound = sound;
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
        return "ProductInfo{" +
                "manufacturer='" + manufacturer + '\'' +
                ", series='" + series + '\'' +
                ", model='" + model + '\'' +
                ", application='" + application + '\'' +
                ", type='" + type + '\'' +
                ", mountingLocation='" + mountingLocation + '\'' +
                ", accessories='" + accessories + '\'' +
                ", modelYear=" + modelYear +
                ", airflow=" + airflow +
                ", power=" + power +
                ", powerMin=" + powerMin +
                ", operatingVoltage=" + operatingVoltage +
                ", operatingVoltageMin=" + operatingVoltageMin +
                ", fanSpeed=" + fanSpeed +
                ", fanSpeedMin=" + fanSpeedMin +
                ", fanSpeedNum=" + fanSpeedNum +
                ", diameter=" + diameter +
                ", sound=" + sound +
                ", height=" + height +
                ", heightMin=" + heightMin +
                ", weight=" + weight +
                ", productBrand='" + productBrand + '\'' +
                ", certification='" + certification + '\'' +
                '}';
    }
}
