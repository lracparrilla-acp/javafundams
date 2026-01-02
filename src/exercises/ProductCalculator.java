package exercises;

public class ProductCalculator {

    //CONSTANTS - tax rate and discount percentage
    private static final double TAX_RATE = 0.08;
    private static final int DISCOUNT_PERCENTAGE = 10;

    public static void main(String[] args) {
        //VARIABLE DECLARATION
        String productName = "Wireless Keyboard";
        double unitPrice = 79.99;
        int quantity = 3;
        boolean hasBulkDiscount = true;

        //Calculate subtotal
        double subtotal = unitPrice * quantity;

        //Apply discount if applicable.
        double discountAmount = 0;
        if (hasBulkDiscount) {
            discountAmount = (subtotal * ((double) DISCOUNT_PERCENTAGE / 100));
        }
        double discountedSubtotal = subtotal - discountAmount;

        //Calculate tax amount.
        double taxAmount = discountedSubtotal * TAX_RATE;

        double finalTotal = discountedSubtotal + taxAmount;

        //Output
        System.out.println("==========PRODUCT INVOICE==========");
        System.out.println("Product: " + productName);
        System.out.println("Unit Price: ₱" + String.format("%.2f", unitPrice));
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: ₱" + String.format("%.2f", subtotal));
        System.out.println("Discount (10%)" + String.format("%.2f", discountAmount));
        System.out.println("Tax (8%)" + String.format("%.2f", taxAmount));
        System.out.println("Final total: ₱" + String.format("%.2f", finalTotal));


    }
}
