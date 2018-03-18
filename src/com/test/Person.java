package com.test;

public class Person {

    private Address address1;

    public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    @Override
    public String toString() {
        return "Person from {" +
                "City=" + address1.getCity() + " " +
                "Country=" + address1.getCountry() +
                '}';
    }
}
