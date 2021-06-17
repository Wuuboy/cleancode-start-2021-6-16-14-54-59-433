package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {

    private final Address toAddress;
    private final Address fromAddress;

    public DeliveryManager(String fromAddress, String toAddress) {
        this.toAddress = new Address(toAddress);
        this.fromAddress = new Address(fromAddress);
    }

    public DeliverCenter allocate(){
        if (isSameProvince() && isSameCity()){
            return DeliverCenter.LOCAL;
        }
        if (isSameProvince()) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }


    private boolean isSameProvince() {
        return fromAddress.isSameProvince(toAddress);
    }

    private boolean isSameCity() {
        return fromAddress.isSameCity(toAddress);
    }


}
