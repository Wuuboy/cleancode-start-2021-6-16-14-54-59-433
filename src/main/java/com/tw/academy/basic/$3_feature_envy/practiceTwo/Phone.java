package com.tw.academy.basic.$3_feature_envy.practiceTwo;

public class Phone {
    private final String unformattedNumber;
    public Phone(String unformattedNumber) {
        this.unformattedNumber = unformattedNumber;
    }

    private final static String format = "(%s) %s-%s";

    public String getMobilePhoneNumber() {
        String areaCode = unformattedNumber.substring(0,3);
        String prefix = unformattedNumber.substring(3,6);
        String number = unformattedNumber.substring(6,10);
        return String.format(format, areaCode, prefix, number);
//        return "(" +
//                areaCode + ") " +
//                prefix + "-" +
//                number;
    }
}
