package com.base.models;

public class OrderDetails {

    private int orderId;
    private int customerID;
    private String name;
    private String pincode;
    private String city;
    private String address;
    private String phone;

    public OrderDetails(int orderId, int customerID, String name, String pincode, String city, String address, String phone) {
        this.orderId = orderId;
        this.customerID = customerID;
        this.name = name;
        this.pincode = pincode;
        this.city = city;
        this.address = address;
        this.phone = phone;
    }

    public OrderDetails(int customerID, String name, String pincode, String city, String address, String phone) {
        this.customerID = customerID;
        this.name = name;
        this.pincode = pincode;
        this.city = city;
        this.address = address;
        this.phone = phone;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderId=" + orderId +
                ", customerID=" + customerID +
                ", name='" + name + '\'' +
                ", pincode='" + pincode + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


    /**private int orderId;
    private String senderName;
    private String receiverName;
    private String senderCity;
    private String receiverCity;
    private int senderPincode;
    private int receiverPincode;
    private String senderAddress;
    private String receiverAddress;
    private String senderPhone;
    private String receiverPhone;

    public OrderDetails(int orderId, String senderName, String receiverName, String senderCity, String receiverCity, int senderPincode, int receiverPincode, String senderAddress, String receiverAddress, String senderPhone, String receiverPhone) {
        this.orderId = orderId;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.senderCity = senderCity;
        this.receiverCity = receiverCity;
        this.senderPincode = senderPincode;
        this.receiverPincode = receiverPincode;
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
        this.senderPhone = senderPhone;
        this.receiverPhone = receiverPhone;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getSenderCity() {
        return senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public int getSenderPincode() {
        return senderPincode;
    }

    public void setSenderPincode(int senderPincode) {
        this.senderPincode = senderPincode;
    }

    public int getReceiverPincode() {
        return receiverPincode;
    }

    public void setReceiverPincode(int receiverPincode) {
        this.receiverPincode = receiverPincode;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }*/
}
