package com.ubereats.model;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client extends Person {

    @Column(name = "address")
    private String address;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "rangeDistanceToLocal")
    private Long rangeDistanceToLocal;


    public Client() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getRangeDistanceToLocal() {
        return rangeDistanceToLocal;
    }

    public void setRangeDistanceToLocal(Long rangeDistanceToLocal) {
        this.rangeDistanceToLocal = rangeDistanceToLocal;
    }
}
