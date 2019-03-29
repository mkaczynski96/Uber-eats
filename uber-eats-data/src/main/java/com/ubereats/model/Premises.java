package com.ubereats.model;

import javax.persistence.*;

@Entity
@Table(name = "premises")
public class Premises extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "rangeDistance")
    private Long rangeDistance;

    public Premises() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getRangeDistance() {
        return rangeDistance;
    }

    public void setRangeDistance(Long rangeDistance) {
        this.rangeDistance = rangeDistance;
    }
}
