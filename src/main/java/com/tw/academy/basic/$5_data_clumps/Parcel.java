package com.tw.academy.basic.$5_data_clumps;

public class Parcel {
    private String size;
    private Double weight;

    private String receiverName;
    private String receiverPhoneNumber;
    private String receiverAddress;

    private String senderName;
    private String senderPhoneNumber;
    private String senderAddress;

    public Parcel(String size, Double weight,
                  User user, User user1) {
        this.size = size;
        this.weight = weight;
        this.receiverName = user.getName();
        this.receiverPhoneNumber = user.getPhoneNumber();
        this.receiverAddress = user.getReceiverAddress();
        this.senderName = user1.getName();
        this.senderPhoneNumber = user1.getPhoneNumber();
        this.senderAddress = user1.getReceiverAddress();
    }

    public String confirmReceiver(){
        return String.format("Please confirm receiver information: receiver name is %s, " +
                        "receiver phone number is %s and receiver address is %s.\n",
                receiverName, receiverPhoneNumber, receiverAddress);
    }

    public String confirmSender(){
        return String.format("Please confirm sender information: sender name is %s, " +
                        "sender phone number is %s and sender address is %s.\n",
                senderName, senderPhoneNumber, senderAddress);
    }
}
