package com.example.userManagement.model;

public class User {
    private int UserId;
    private String Name;
    private String UserName;
    private String Address;
    private String PhoneNumber;

    public int getUserId() {
        return UserId;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public User() {
    }

    public User(int userId,String Name,String UserName,String Address, String PhoneNumber) {
        this.UserId = userId;
        this.Name=Name;
        this.UserName=UserName;
        this.Address=Address;
        this.PhoneNumber=PhoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", Name='" + Name + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}
