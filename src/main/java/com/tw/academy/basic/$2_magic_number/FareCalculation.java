package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {

    private static final int cumulativeExpensesClass1Min = 100;
    private static final int cumulativeExpensesClass1Max = 150;
    private static final double cumulativeExpensesClass1Discount = 0.8;
    private static final int cumulativeExpensesClass2Min = 150;
    private static final int cumulativeExpensesClass2Max = 400;
    private static final double cumulativeExpensesClass2Discount = 0.5;

    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (cumulativeExpensesThisMonth >= cumulativeExpensesClass1Min && cumulativeExpensesThisMonth < cumulativeExpensesClass1Max) {
            return originalPrice * cumulativeExpensesClass1Discount;
        }
        if (cumulativeExpensesThisMonth >= cumulativeExpensesClass2Min && cumulativeExpensesThisMonth < cumulativeExpensesClass2Max) {
            return originalPrice * cumulativeExpensesClass2Discount;
        }
        return originalPrice;
    }
}
