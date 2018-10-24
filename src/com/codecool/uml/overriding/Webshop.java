package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {
        AbstractProcess checkout = new CheckoutProcess();
        AbstractProcess pay = new PaymentProcess();

	    Order order1 = new Order();
        System.out.println(order1);
        checkout.process(order1);
        pay.process(order1);
        System.out.println(order1);


        Order order2 = new Order();
        System.out.println(order2);
        checkout.process(order2);
        pay.process(order2);
        System.out.println(order2);

    }
}
