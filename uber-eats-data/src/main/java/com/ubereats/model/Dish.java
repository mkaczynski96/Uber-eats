package com.ubereats.model;

import javax.persistence.*;

@Entity
@Table(name = "dishes")
public class Dish extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "size")
    private String size;

    @Column(name = "notes")
    private String notes;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "premises_id")
    private Premises premises;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;



    public Dish() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Premises getPremises() {
        return premises;
    }

    public void setPremises(Premises premises) {
        this.premises = premises;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
