package com.ubereats.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "bills")
public class Bill extends BaseEntity{

    @Column(name = "paid")
    private boolean paid;

    @Column(name = "totalAmount")
    private float totalAmount;

    @Column(name = "delivery")
    private boolean delivery;

    @Column(name = "deliveryTime")
    private int deliveryTime;

    @Column(name = "localDate")
    private LocalDate localDate;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "premises_id")
    private Premises premises;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "bill_dishes", joinColumns = @JoinColumn(name = "bill_id"),
            inverseJoinColumns = @JoinColumn(name = "dish_id"))
    private Set<Dish> dish = new HashSet<>();

    public Bill() {
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Premises getPremises() {
        return premises;
    }

    public void setPremises(Premises premises) {
        this.premises = premises;
    }

    public Set<Dish> getDish() {
        return dish;
    }

    public void setDish(Set<Dish> dish) {
        this.dish = dish;
    }
}
