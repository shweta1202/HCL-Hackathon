package com.example.bazar_setu.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RequestId implements Serializable {

    private String shopkeeperContactNumber;

    private String consumerContactNumber;

    public String getShopkeeperContactNumber() {
        return shopkeeperContactNumber;
    }

    public void setShopkeeperContactNumber(String shopkeeperContactNumber) {
        this.shopkeeperContactNumber = shopkeeperContactNumber;
    }

    public String getConsumerContactNumber() {
        return consumerContactNumber;
    }

    public void setConsumerContactNumber(String consumerContactNumber) {
        this.consumerContactNumber = consumerContactNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestId requestId = (RequestId) o;
        return Objects.equals(shopkeeperContactNumber, requestId.shopkeeperContactNumber) &&
                Objects.equals(consumerContactNumber, requestId.consumerContactNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopkeeperContactNumber, consumerContactNumber);
    }
}
