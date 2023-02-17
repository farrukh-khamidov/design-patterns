package strategy_pattern.example2.controller;

import strategy_pattern.example2.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public void pay(Payment paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Product product : productList) {
            sum += product.getPrice();
        }
        return sum;
    }
}
