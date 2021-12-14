package com.base.models;

public class CustomerInfo {

    private int customerID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String eMailID;
    private String password;

    public CustomerInfo(String firstName, String lastName, String phoneNumber, String eMailID, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.eMailID = eMailID;
        this.password = password;
    }

    public CustomerInfo() {

    }

    public CustomerInfo(int customerID, String eMailID, String password) {
        this.customerID = customerID;
        this.eMailID = eMailID;
        this.password = password;
    }

    public CustomerInfo(String firstName, String lastName, String phoneNumber, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMailID() {
        return eMailID;
    }

    public void seteMailID(String eMailID) {
        this.eMailID = eMailID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer_Info --> {Name = " + firstName + "} {Last Name " + lastName + "} " +
                "{Phone Number " + phoneNumber + "} {Email ID " + eMailID + "} {Password " + password + "}";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}