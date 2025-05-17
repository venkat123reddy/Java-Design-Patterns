package lld.design.patterns.strategy;

public class ShoppingCart {

    PaymentStrategy paymentStrategy;

    ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {

        this.paymentStrategy.pay(234);
    }
}
