package model;

public class Client extends Person {

    private String address;
    private int phoneNumber;
    private int rangeDistanceToLocal;

    public Client() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRangeDistanceToLocal() {
        return rangeDistanceToLocal;
    }

    public void setRangeDistanceToLocal(int rangeDistanceToLocal) {
        this.rangeDistanceToLocal = rangeDistanceToLocal;
    }
}
