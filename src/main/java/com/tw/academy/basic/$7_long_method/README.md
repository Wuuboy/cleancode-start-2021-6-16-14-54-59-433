1. L11 name is not meaningful.
2. L18 useless method should be deleted.
3. L22 todo should do it and remove this comment.
4. all magic number should be extract to constants with meaningful names.
5. extract methods for each action such as calculations and output.
#### 
#### 


### Code smell
1. line 11 --> the member field o should have a meaningful name and add final
2. line 17-20 --> the deprecated method printCustomerName() should be removed
3. line 22 --> the remaining todo, push tom to fix it asap!!!
4. line 26-27 --> remove comment and extract a method to append header, and extract header to a constant
5. line 29-33 --> remove useless comment and extract a method to append customer information
6. line 35-60 --> extract appendOrderInfo method to append order items' information
7. line 36-37 --> rename totSalesTx and tot to full name totalSalesTax and totalAmount
8. line 39-46 --> extract \t to a constant and use chain call to instead
9. line 48-50 --> extract a method calculateLineItemSalesTax() and constant, remove comment
10. line 52-53 --> extract a method calculateLineItemAmount
11. line 56-60 --> extract a method appendOrderTotalTaxAndAmount and extract constant
12. line 46 --> extract \n to a constant