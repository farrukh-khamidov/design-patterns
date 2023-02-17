package strategy_pattern.example2;

import strategy_pattern.example2.controller.CreditCardAlgorithm;
import strategy_pattern.example2.controller.PaypalAlgorithm;
import strategy_pattern.example2.controller.ShoppingCard;
import strategy_pattern.example2.model.Product;

public class Main {
    public static void main(String[] args) {
        ShoppingCard card = new ShoppingCard();

        Product pants = new Product("234", 25);
        Product shirt = new Product("987", 15);

        card.addProduct(pants);
        card.addProduct(shirt);

        // payment decision
        card.pay(new PaypalAlgorithm("farrukh@gmail.com", "nowayman"));
        card.pay(new CreditCardAlgorithm("Farrukh", "860001012514"));
    }
}