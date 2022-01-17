package com.spring.airport.POJO;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

public class AMSystem {

    private String PilotName;

    private String license;

    private long SSN;
    private Date dob;
    private String Gender;
    private long MobileNo;
    @Email(message = "EmailId not valid")
    private String Email;
    private String Address;
    private String AddressLine1;
    private String city;
    private String State;
    private String Country;
    private int PinNo;
    private String UID;
    private String AdreesId;

    @Override
    public String toString() {
        return "AMSystem{" +
                "PilotName='" + PilotName + '\'' +
                ", license='" + license + '\'' +
                ", SSN=" + SSN +
                ", dob=" + dob +
                ", Gender='" + Gender + '\'' +
                ", MobileNo=" + MobileNo +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                ", AddressLine1='" + AddressLine1 + '\'' +
                ", city='" + city + '\'' +
                ", State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                ", PinNo=" + PinNo +
                ", UID='" + UID + '\'' +
                ", AdreesId='" + AdreesId + '\'' +
                '}';
    }



    public String getAdreesId() {
        return AdreesId;
    }

    public void setAdreesId(String adreesId) {
        AdreesId = adreesId;
    }



    public AMSystem(String UID) {
        this.UID = UID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }


    public AMSystem()
    {

    }

    public String getPilotName() {
        return PilotName;
    }

    public void setPilotName(String pilotName) {
        PilotName = pilotName;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public long getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(long mobileNo) {
        MobileNo = mobileNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        AddressLine1 = addressLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getPinNo() {
        return PinNo;
    }

    public void setPinNo(int pinNo) {
        PinNo = pinNo;
    }


    public AMSystem(String pilotName, String license, long SSN, Date dob, String gender, long mobileNo,
                    String email, String address,
                    String addressLine1, String city, String state, String country, int pinNo) {
        PilotName = pilotName;
        this.license = license;
        this.SSN = SSN;
        this.dob = dob;
        Gender = gender;
        MobileNo = mobileNo;
        Email = email;
        Address = address;
        AddressLine1 = addressLine1;
        this.city = city;
        State = state;
        Country = country;
        PinNo = pinNo;
    }


}
