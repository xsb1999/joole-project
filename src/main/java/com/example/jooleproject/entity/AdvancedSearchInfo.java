package com.example.jooleproject.entity;

public class AdvancedSearchInfo {
    private String type;
    private String application;
    private String mountingLocation;
    private String accessories;
    private Integer yearStart;
    private Integer yearEnd;
    private Integer airflowMin;
    private Integer airflowMax;
    private Integer powerMin;
    private Integer powerMax;
    private Integer soundMin;
    private Integer soundMax;
    private Integer diameterMin;
    private Integer diameterMax;
    private Integer heightMin;
    private Integer heightMax;
    private String productBrand;

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

    public Integer getYearStart() {
        return yearStart;
    }

    public void setYearStart(Integer yearStart) {
        this.yearStart = yearStart;
    }

    public Integer getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(Integer yearEnd) {
        this.yearEnd = yearEnd;
    }

    public Integer getAirflowMin() {
        return airflowMin;
    }

    public void setAirflowMin(Integer airflowMin) {
        this.airflowMin = airflowMin;
    }

    public Integer getAirflowMax() {
        return airflowMax;
    }

    public void setAirflowMax(Integer airflowMax) {
        this.airflowMax = airflowMax;
    }

    public Integer getPowerMin() {
        return powerMin;
    }

    public void setPowerMin(Integer powerMin) {
        this.powerMin = powerMin;
    }

    public Integer getPowerMax() {
        return powerMax;
    }

    public void setPowerMax(Integer powerMax) {
        this.powerMax = powerMax;
    }

    public Integer getSoundMin() {
        return soundMin;
    }

    public void setSoundMin(Integer soundMin) {
        this.soundMin = soundMin;
    }

    public Integer getSoundMax() {
        return soundMax;
    }

    public void setSoundMax(Integer soundMax) {
        this.soundMax = soundMax;
    }

    public Integer getDiameterMin() {
        return diameterMin;
    }

    public void setDiameterMin(Integer diameterMin) {
        this.diameterMin = diameterMin;
    }

    public Integer getDiameterMax() {
        return diameterMax;
    }

    public void setDiameterMax(Integer diameterMax) {
        this.diameterMax = diameterMax;
    }

    public Integer getHeightMin() {
        return heightMin;
    }

    public void setHeightMin(Integer heightMin) {
        this.heightMin = heightMin;
    }

    public Integer getHeightMax() {
        return heightMax;
    }

    public void setHeightMax(Integer heightMax) {
        this.heightMax = heightMax;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    @Override
    public String toString() {
        return "AdvancedSearchInfo{" +
                "type='" + type + '\'' +
                ", application='" + application + '\'' +
                ", mountingLocation='" + mountingLocation + '\'' +
                ", accessories='" + accessories + '\'' +
                ", yearStart=" + yearStart +
                ", yearEnd=" + yearEnd +
                ", airflowMin=" + airflowMin +
                ", airflowMax=" + airflowMax +
                ", powerMin=" + powerMin +
                ", powerMax=" + powerMax +
                ", soundMin=" + soundMin +
                ", soundMax=" + soundMax +
                ", diameterMin=" + diameterMin +
                ", diameterMax=" + diameterMax +
                ", heightMin=" + heightMin +
                ", heightMax=" + heightMax +
                ", productBrand='" + productBrand + '\'' +
                '}';
    }
}
