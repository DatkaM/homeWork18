package com.company;

public class Dormitory implements Payable{
    private String address;

    public Dormitory(String address) {
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
        System.out.println("Live in "+address+ " and pay 1000 som.");
    }

    @Override
    public String toString() {
        return "Dormitory: " +
                "address: '" + address + '\'';
    }
}
