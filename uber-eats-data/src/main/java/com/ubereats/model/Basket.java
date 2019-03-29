package com.ubereats.model;

import java.util.HashSet;
import java.util.Set;

public class Basket extends BaseEntity {

    private float deliveryPayment;

    private float totalAmount;

    private Set<Dish> dish = new HashSet<>();

    public float getDeliveryPayment() {
        return deliveryPayment;
    }

    public void setDeliveryPayment(float deliveryPayment) {
        this.deliveryPayment = deliveryPayment;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Set<Dish> getDish() {
        return dish;
    }

    public void setDish(Set<Dish> dish) {
        this.dish = dish;
    }
}
