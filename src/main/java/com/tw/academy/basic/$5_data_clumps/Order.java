package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private int orderNumber;

    private String buyerPhoneNumber;
    private String buyerAddress;

    private User user;





    public Order(int orderNumber, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.orderNumber = orderNumber;

        User user = new User();
        user.setName(buyerName);
        this.buyerPhoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }

    public String confirm(){
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", user.getName(), buyerPhoneNumber, buyerAddress);
    }
}

