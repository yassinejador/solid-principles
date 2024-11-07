public class DiscountCalculator {
    private Discount discountStrategy;

    DiscountCalculator(Discount discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    int calculateDiscount() {
        return discountStrategy.calculate();
    }
}
