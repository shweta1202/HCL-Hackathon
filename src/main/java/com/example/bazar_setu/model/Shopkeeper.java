package com.example.bazar_setu.model;

import javax.persistence.*;

@Entity(name = "shopkeeper_info")
public class Shopkeeper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "location")
    private String location;

    @Column(name = "shop_name")
    private String shopName;

    @Column(name = "shop_type")
    private String shopType;

    @Column(name = "password")
    private String password;

    @Column(name = "shop_image")
    private String shopImage;

    @Column(name = "shop_status")
    private boolean shopStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShopImage() {
        return shopImage;
    }

    public void setShopImage(String shopImage) {
        this.shopImage = shopImage;
    }

    public boolean isShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(boolean shopStatus) {
        this.shopStatus = shopStatus;
    }
}
