package com.uk.umf_solutions.warehousehelperv2.Model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Eaun-Ballinger on 28/01/2017.
 *
 */

public class Suppliers extends RealmObject{
    @PrimaryKey
    private long supplierId;
    //private ImageView planner_image;
    private String supplier;
    private String supplierCode;
    private String planner;
    private String plannerNumber;
    private String backupPlanner;
    private String backupPlannerNumber;
    private String country;
    private String plannerEmail;
    private long numberOfParts;

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getPlanner() {
        return planner;
    }

    public void setPlanner(String planner) {
        this.planner = planner;
    }

    public String getPlannerNumber() {
        return plannerNumber;
    }

    public void setPlannerNumber(String plannerNumber) {
        this.plannerNumber = plannerNumber;
    }

    public String getBackupPlanner() {
        return backupPlanner;
    }

    public void setBackupPlanner(String backupPlanner) {
        this.backupPlanner = backupPlanner;
    }

    public String getBackupPlannerNumber() {
        return backupPlannerNumber;
    }

    public void setBackupPlannerNumber(String backupPlannerNumber) {
        this.backupPlannerNumber = backupPlannerNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlannerEmail() {
        return plannerEmail;
    }

    public void setPlannerEmail(String plannerEmail) {
        this.plannerEmail = plannerEmail;
    }

    public long getNumberOfParts() {
        return numberOfParts;
    }

    public void setNumberOfParts(long numberOfParts) {
        this.numberOfParts = numberOfParts;
    }


//    public ImageView getPlanner_image() {
//        return planner_image;
//    }
//
//        public void setPlanner_image(ImageView planner_image) {
//        this.planner_image = planner_image;
//    }
}
