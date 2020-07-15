package com.example.bazar_setu.model;

import javax.persistence.*;

@Entity(name = "request_info")
public class Request {

    @EmbeddedId
    private RequestId requestId;

    @Column(name = "slot_id")
    private Integer slotId;

    @Column(name = "items")
    private String items;

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

    public RequestId getRequestId() {
        return requestId;
    }

    public void setRequestId(RequestId requestId) {
        this.requestId = requestId;
    }
}
