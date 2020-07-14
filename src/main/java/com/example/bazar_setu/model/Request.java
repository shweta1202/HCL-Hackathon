package com.example.bazar_setu.model;

import javax.persistence.*;

@Entity(name = "request_info")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "consumer_contact_number")
    private String consumerContactNumber;

    @Column(name = "shopkeeper_contact_number")
    private String shopkeeperContactNumber;

    @Column(name = "slot_id")
    private Integer slotId;

    @Column(name = "items")
    private String items;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsumerContactNumber() {
        return consumerContactNumber;
    }

    public void setConsumerContactNumber(String consumerContactNumber) {
        this.consumerContactNumber = consumerContactNumber;
    }

    public String getShopkeeperContactNumber() {
        return shopkeeperContactNumber;
    }

    public void setShopkeeperContactNumber(String shopkeeperContactNumber) {
        this.shopkeeperContactNumber = shopkeeperContactNumber;
    }

    public Integer getSlotId() {
        return slotId;
    }

    public void setSlotId(Integer slotId) {
        this.slotId = slotId;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }
}
