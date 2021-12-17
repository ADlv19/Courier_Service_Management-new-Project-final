package com.base.models;

public class Product {

    private int orderID;
    private int customerID;
    private String parcelType;
    private double parcelWeightInKG;
    private double distance;
    private String orderDate;
    private String estDeliveryDate;
    private double fee;
    private String paymentType;

    public Product() {
    }

    public Product(int customerID, String parcelType, double parcelWeightInKG, double distance, String orderDate, String estDeliveryDate, double fee, String paymentType) {
        this.customerID = customerID;
        this.parcelType = parcelType;
        this.parcelWeightInKG = parcelWeightInKG;
        this.distance = distance;
        this.orderDate = orderDate;
        this.estDeliveryDate = estDeliveryDate;
        this.fee = fee;
        this.paymentType = paymentType;
    }
    
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getParcelType() {
        return parcelType;
    }

    public void setParcelType(String parcelType) {
        this.parcelType = parcelType;
    }

    public double getParcelWeightInKG() {
        return parcelWeightInKG;
    }

    public void setParcelWeightInKG(double parcelWeightInKG) {
        this.parcelWeightInKG = parcelWeightInKG;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getEstDeliveryDate() {
        return estDeliveryDate;
    }

    public void setEstDeliveryDate(String estDeliveryDate) {
        this.estDeliveryDate = estDeliveryDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Product{" +
                "orderID=" + orderID +
                ", customerID=" + customerID +
                ", parcelType='" + parcelType + '\'' +
                ", parcelWeightInKG=" + parcelWeightInKG +
                ", distance=" + distance +
                ", orderDate='" + orderDate + '\'' +
                ", estDeliveryDate='" + estDeliveryDate + '\'' +
                ", fee=" + fee +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }
}
