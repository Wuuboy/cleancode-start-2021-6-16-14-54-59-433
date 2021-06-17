package com.tw.academy.basic.$5_data_clumps;

public class User {
    private final String name;
    private final String phoneNumber;
    private final String receiverAddress;

    public User(String receiverName, String receiverPhoneNumber, String receiverAddress) {
        name = receiverName;
        phoneNumber = receiverPhoneNumber;
        this.receiverAddress = receiverAddress;
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
