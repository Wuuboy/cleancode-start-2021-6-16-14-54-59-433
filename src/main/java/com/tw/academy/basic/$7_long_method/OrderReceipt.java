package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private final Order order;

    final String ORDER_HEADER = "======Printing Orders======\n";
    final double SALES_TAX_RATE = .10;
    final String SALES_TAX_PREFIX = "Sales Tax";
    final String TOTAL_AMOUNT_PREFIX = "Total Amount";
    final char TAB = '\t';
    final String LINE_BREAK = "\n";

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String generateReceipt() {
        StringBuilder receipt = new StringBuilder();
        appendHeader(receipt);
        appendCustomerName(receipt);
        appendCustomerAddress(receipt);
        return appendOrderItemInfo(receipt);

    }

    private String appendOrderItemInfo(StringBuilder receipt) {
        double totalSalesTax = 0d;
        double totalAmountLineItems = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            receipt.append(lineItem.getDescription());
            receipt.append(TAB);
            receipt.append(lineItem.getPrice());
            receipt.append(TAB);
            receipt.append(lineItem.getQuantity());
            receipt.append(TAB);
            receipt.append(lineItem.totalAmount());
            receipt.append(LINE_BREAK);

            totalSalesTax += calculateLineItemSalesTax(lineItem);
            totalAmountLineItems += calculateLineItemTotalAmount(lineItem);
        }

        appendStateTax(receipt, totalSalesTax);
        appendTotalAmount(receipt, totalAmountLineItems);
        return receipt.toString();
    }

    private void appendTotalAmount(StringBuilder receipt, double tot) {
        receipt.append(TOTAL_AMOUNT_PREFIX).append(TAB).append(tot);
    }

    private void appendStateTax(StringBuilder receipt, double totSalesTx) {
        receipt.append(SALES_TAX_PREFIX).append(TAB).append(totSalesTx);
    }

    private void appendCustomerAddress(StringBuilder output) {
        output.append(order.getCustomerAddress());
    }

    private void appendCustomerName(StringBuilder output) {
        output.append(order.getCustomerName());
    }

    private void appendHeader(StringBuilder output) {
        output.append(ORDER_HEADER);
    }

    private double calculateLineItemSalesTax(LineItem lineItem) {
        return lineItem.totalAmount() * SALES_TAX_RATE;
    }

    private double calculateLineItemTotalAmount(LineItem lineItem) {
        return lineItem.totalAmount() + calculateLineItemSalesTax(lineItem);
    }
}