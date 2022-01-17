package com.spring.airport.POJO;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AddPlanes {

    @NotBlank(message = "Manufacturer Name cannot be blank")
    private String mfgName;

    private int regNo;
    private String modelNo;
    private int planeNo;
    private String planeName;
    private int capacity;
    @Email(message = "Not a valid EmailId")
    private String email;
    private int houseNo;
    private String address;
    private String city;
    private String state;
    private String country;

    private int pinNo;
   public AddPlanes(){}
    public AddPlanes(String mfgName, int regNo, String modelNo, int planeNo, String planeName, int capacity, String email, int houseNo, String address, String city, String state, String country, int pinNo) {
        this.mfgName = mfgName;
        this.regNo = regNo;
        this.modelNo = modelNo;
        this.planeNo = planeNo;
        this.planeName = planeName;
        this.capacity = capacity;
        this.email = email;
        this.houseNo = houseNo;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinNo = pinNo;
    }

    public String getMfgName() {
        return mfgName;
    }

    public void setMfgName(String mfgName) {
        this.mfgName = mfgName;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public int getPlaneNo() {
        return planeNo;
    }

    public void setPlaneNo(int planeNo) {
        this.planeNo = planeNo;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPinNo() {
        return pinNo;
    }

    public void setPinNo(int pinNo) {
        this.pinNo = pinNo;
    }
}


