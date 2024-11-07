public class OrderService {

    private IPayment ipayment;
    OrderService(IPayment ipayment) {
        this.ipayment = ipayment;
    }

    void order() {
        // Order Logic..
        ipayment.pay();
    }

}