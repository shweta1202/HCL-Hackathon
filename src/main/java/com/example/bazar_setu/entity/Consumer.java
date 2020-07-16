package com.example.bazar_setu.entity;

import javax.persistence.*;

@Entity(name = "consumer_info")
public class Consumer {

    @Id
    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "password")
    private String password;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
