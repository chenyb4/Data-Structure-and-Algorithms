package com.company.models;

import com.company.StatusType;

import java.util.Date;

public class Package implements Comparable<Package>{

    private int packageId, length, breadth,height;
    private Date entryDate;
    private double weight;
    private StatusType status;
    private Client client;

    @Override
    public int compareTo(Package o) {
        return 0;
    }

    //getters and setters
    public int getPackageId() {
        return packageId;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getHeight() {
        return height;
    }

    public Client getClient() {
        return client;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public double getWeight() {
        return weight;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }



    //construcors

    public Package(int packageId, int length, int breadth, int height, Client client, Date entryDate, double weight) {
        this.packageId = packageId;
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.client = client;
        this.entryDate = entryDate;
        this.weight = weight;
        this.status=StatusType.InDistributionCenter;
    }
}
