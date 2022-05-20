package com.company;

public class Hotel implements Payable{
    private String address;

    public Hotel(String address) {
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
        System.out.println("Live in "+ address+" and pay 5000 som.");
    }

    @Override
    public String toString() {
        return "Hotel: " +
                "address: '" + address + '\'' ;
    }
}
