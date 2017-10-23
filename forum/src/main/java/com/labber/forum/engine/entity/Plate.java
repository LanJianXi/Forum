package com.labber.forum.engine.entity;

/**
 * @author Tony
 * @create 2017 - 10 -23 -23:09
 */
public class Plate extends BaseEntity{

    private String plateId;
    private String plateTitle;
    private String plateDesc;
    private int status;

    public String getPlateId() {
        return plateId;
    }

    public void setPlateId(String plateId) {
        this.plateId = plateId;
    }

    public String getPlateTitle() {
        return plateTitle;
    }

    public void setPlateTitle(String plateTitle) {
        this.plateTitle = plateTitle;
    }

    public String getPlateDesc() {
        return plateDesc;
    }

    public void setPlateDesc(String plateDesc) {
        this.plateDesc = plateDesc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
