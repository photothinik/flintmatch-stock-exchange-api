package com.flintmatch.stockexchange.api.model;

import java.io.Serializable;
import java.util.Objects;

public class OrderTransactionId implements Serializable {

    private Long sellerId;
    private Long buyerId;

    public OrderTransactionId() {
    }

    public OrderTransactionId(Long sellerId, Long buyerId) {
        this.sellerId = sellerId;
        this.buyerId = buyerId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderTransactionId that = (OrderTransactionId) o;
        return sellerId.equals(that.sellerId) &&
                buyerId.equals(that.buyerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerId, buyerId);
    }
}
