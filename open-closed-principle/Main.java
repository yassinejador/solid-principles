public class Main {
    public static void main(String[] args) {
        // For a regular customer
        DiscountCalculator regularCalculator = new DiscountCalculator(new RegularDiscount());
        System.out.println("Regular Customer Discount: " + regularCalculator.calculateDiscount());

        // For a VIP customer
        DiscountCalculator vipCalculator = new DiscountCalculator(new VIPDiscount());
        System.out.println("VIP Customer Discount: " + vipCalculator.calculateDiscount());

        // For a premium customer
        DiscountCalculator premiumCalculator = new DiscountCalculator(new PremiumDiscount());
        System.out.println("Premium Customer Discount: " + premiumCalculator.calculateDiscount());
    }
}
