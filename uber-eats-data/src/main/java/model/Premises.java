package model;

import java.util.Set;

public class Premises extends BaseEntity{

    private String name;
    private String address;
    private Set<Dish> dish;

    public Premises() {

    }

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

    public Set<Dish> getDish() {
        return dish;
    }

    public void setDish(Set<Dish> dish) {
        this.dish = dish;
    }
}
