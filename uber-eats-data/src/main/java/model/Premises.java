package model;

public class Premises extends BaseEntity{

    private String name;
    private String address;
    private Dish dish;

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
}
