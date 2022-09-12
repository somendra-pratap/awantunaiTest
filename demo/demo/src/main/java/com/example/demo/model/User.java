package com.example.demo.model;

public class User {
    private String name;
    private String Address;
    private String phoneNumber;
    private String email;
    private Short age;

    public User(String name, String address, String phoneNumber, String email, Short age) {
        this.name = name;
        Address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }
}
