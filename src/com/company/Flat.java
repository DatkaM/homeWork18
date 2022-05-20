package com.company;

public class Flat implements Payable {
    private String address;

    public Flat(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void payable() {
        System.out.println("Live in "+ address + " and pay 2000 som.");
    }

    @Override
    public String toString() {
        return "Flat: " +
                "address: '" + address + '\'';
    }
}
