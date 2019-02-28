package com.axity.strategy;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678", 50);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);

        //pay for Paypal
        cart.pay(new PaypalStrategy("sergio_fr@outlook.es","myped"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Sergio F","1234567891434567","246","12/15"));
    }
}
