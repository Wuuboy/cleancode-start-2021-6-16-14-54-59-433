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

    //todo: rename -- Tom
    public String printReceipt() {
        StringBuilder output = new StringBuilder();
        appendHeader(output);
        appendCustomerName(output);
        appendCustomerAddress(output);
        return appendOrderItemInfo(output);

    }

    private String appendOrderItemInfo(StringBuilder output) {
        double totalSalesTax = 0d;
        double totalAmountLineItems = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append(TAB);
            output.append(lineItem.getPrice());
            output.append(TAB);
            output.append(lineItem.getQuantity());
            output.append(TAB);
            output.append(lineItem.totalAmount());
            output.append(LINE_BREAK);

            totalSalesTax += calculateLineItemSalesTax(lineItem);
            totalAmountLineItems += calculateLineItemTotalAmount(lineItem);
        }

        appendStateTax(output, totalSalesTax);
        appendTotalAmount(output, totalAmountLineItems);
        return output.toString();
    }

    private void appendTotalAmount(StringBuilder output, double tot) {
        output.append(TOTAL_AMOUNT_PREFIX).append(TAB).append(tot);
    }

    private void appendStateTax(StringBuilder output, double totSalesTx) {
        output.append(SALES_TAX_PREFIX).append(TAB).append(totSalesTx);
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