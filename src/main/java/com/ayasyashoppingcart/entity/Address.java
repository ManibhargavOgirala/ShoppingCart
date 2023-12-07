package com.ayasyashoppingcart.entity;

import jakarta.persistence.*;

@Entity
@Table(name="address")
public class Address extends BaseClass{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;



    @Column(name = "email_address",unique = true)
    private String emailAddress;
    @Column(name="contactNo",unique = true)
    private String contactNo;
   @Column(name="country")
    private String country;
    @Column(name="pincode")
   private String pincode;
    @Column(name ="doorNo")
    private String doorNo;
    @Column(name ="street")
    private String street;

    @Column(name ="landMark")
    private String landMark;

    @Column(name ="city")
    private String city;
    @Column(name ="state")
    private String state;


    @Column(name="userId")
    private Long userId;

    public Address(Long addressId, String lastName, String firstName, String emailAddress, String contactNo, String country, String pincode, String doorNo, String street, String landMark, String city, String state, Long userId) {
        this.addressId = addressId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.emailAddress = emailAddress;
        this.contactNo = contactNo;
        this.country = country;
        this.pincode = pincode;
        this.doorNo = doorNo;
        this.street = street;
        this.landMark = landMark;
        this.city = city;
        this.state = state;
        this.userId = userId;
    }

    public Address() {
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", country='" + country + '\'' +
                ", pincode='" + pincode + '\'' +
                ", doorNo='" + doorNo + '\'' +
                ", street='" + street + '\'' +
                ", landMark='" + landMark + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", userId=" + userId +
                '}';
    }
}
