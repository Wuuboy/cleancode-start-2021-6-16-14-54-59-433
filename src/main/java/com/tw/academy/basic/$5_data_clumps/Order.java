package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private int orderNumber;

    private String buyerPhoneNumber;
    private String buyerAddress;

    private User user;

    private String getUserPhoneNumber() {
        return this.user.getPhoneNumber();
    }

    private String getUserName() {
        return this.user.getName();
    }

    private String getAddress() {
        return this.user.getAddress();
    }



    public Order(int orderNumber, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.orderNumber = orderNumber;

        this.user = new User(buyerName, buyerPhoneNumber, buyerAddress);
        this.buyerPhoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }

    public String confirm(){
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", getUserName(), getUserPhoneNumber(), getAddress());
    }
}

