package model;

import java.util.HashSet;
import java.util.Set;

public class Premises extends BaseEntity{

    private String name;
    private String address;
    private Long rangeDistance;
    private Set<Dish> dish  = new HashSet<>();

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

    public Long getRangeDistance() {
        return rangeDistance;
    }

    public void setRangeDistance(Long rangeDistance) {
        this.rangeDistance = rangeDistance;
    }

    public Set<Dish> getDish() {
        return dish;
    }

    public void setDish(Set<Dish> dish) {
        this.dish = dish;
    }
}
