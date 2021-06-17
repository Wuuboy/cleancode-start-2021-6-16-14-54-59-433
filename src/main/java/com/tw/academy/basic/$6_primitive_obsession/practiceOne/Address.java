package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class Address {
    private final String address ;

    public Address(String address) {
        this.address = address;
    }

    String getCity() {
        return address.substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    String getProvince() {
        return address.substring(0, address.indexOf("省"));
    }

    public boolean isSameProvince(Address toAddress) {
        return getProvince().equals(toAddress.getProvince());
    }

    public boolean isSameCity(Address toAddress) {
        return getCity().equals(toAddress.getCity());
    }

}
