package com.codecool.uml.overriding;

public class CheckoutProcess extends AbstractProcess {

    @Override
    protected void action(Orderable item) {
        item.checkout();
    }
}
