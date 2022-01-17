package com.spring.airport.POJO;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;


public class HangerDetails {

    @NotBlank(message = "Cannot be Empty")
    private String hangerLocation;

    private String hangerNumber;

    private int hangerCapacity;

    private int availableCapacity;

    private String managerName;

    private String socialSecurityNo;

    private Date dob;

    private String gender;

    private String mobileNo;

    @Email(message = "Cannot be empty")
    private String email;

    private String houseNo;

    private String address;

    private String city;

    private String state;

    private String country;

    private int pinNo;

    private String addressId;

    private String ManagerId;

    @Override
    public String toString() {
        return "HangerDetails{" +
                "hangerLocation='" + hangerLocation + '\'' +
                ", hangerNumber='" + hangerNumber + '\'' +
                ", hangerCapacity=" + hangerCapacity +
                ", availableCapacity=" + availableCapacity +
                ", managerName='" + managerName + '\'' +
                ", socialSecurityNo=" + socialSecurityNo +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", email='" + email + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pinNo=" + pinNo +
                ", addressId='" + addressId + '\'' +
                ", ManagerId='" + ManagerId + '\'' +
                '}';
    }

    public HangerDetails() {
    }

    public HangerDetails(String hangerLocation, String hangerNumber, int hangerCapacity, int availableCapacity, String managerName, String socialSecurityNo, Date dob, String gender, String mobileNo, String email, String houseNo, String address, String city, String state, String country, int pinNo, String addressId, String managerId) {
        this.hangerLocation = hangerLocation;
        this.hangerNumber = hangerNumber;
        this.hangerCapacity = hangerCapacity;
        this.availableCapacity = availableCapacity;
        this.managerName = managerName;
        this.socialSecurityNo = socialSecurityNo;
        this.dob = dob;
        this.gender = gender;
        this.mobileNo = mobileNo;
        this.email = email;
        this.houseNo = houseNo;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinNo = pinNo;
        this.addressId = addressId;
        ManagerId = managerId;
    }

    public String getHangerLocation() {
        return hangerLocation;
    }

    public void setHangerLocation(String hangerLocation) {
        this.hangerLocation = hangerLocation;
    }

    public String getHangerNumber() {
        return hangerNumber;
    }

    public void setHangerNumber(String hangerNumber) {
        this.hangerNumber = hangerNumber;
    }

    public int getHangerCapacity() {
        return hangerCapacity;
    }

    public void setHangerCapacity(int hangerCapacity) {
        this.hangerCapacity = hangerCapacity;
    }

    public int getAvailableCapacity() {
        return availableCapacity;
    }

    public void setAvailableCapacity(int availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getSocialSecurityNo() {
        return socialSecurityNo;
    }

    public void setSocialSecurityNo(String socialSecurityNo) {
        this.socialSecurityNo = socialSecurityNo;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
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

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getManagerId() {
        return ManagerId;
    }

    public void setManagerId(String managerId) {
        ManagerId = managerId;
    }
}