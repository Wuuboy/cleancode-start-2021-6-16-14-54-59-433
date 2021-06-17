package com.tw.academy.basic.$5_data_clumps;

public class User {
    private final String name;
    private final String phoneNumber;
    private final String receiverAddress;

    public User(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.receiverAddress = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }
}
