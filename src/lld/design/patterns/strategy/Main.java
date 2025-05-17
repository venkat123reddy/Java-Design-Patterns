package lld.design.patterns.strategy;

public class Main {

    public static void main(String []args) {

        ShoppingCart shoppingCart = new ShoppingCart(new PaypalPayment());
        shoppingCart.checkout();

        ShoppingCart shoppingCart1 = new ShoppingCart(new CreditCardPayment());
        shoppingCart.checkout();

    }
}
