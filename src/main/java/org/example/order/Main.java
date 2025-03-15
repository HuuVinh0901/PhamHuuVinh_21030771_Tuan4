package org.example.order;

public class Main {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        OrderState newState = new NewOrderState();
        order.setState(newState);
        order.processOrder();

        OrderState processingState = new ProcessingOrderState();
        order.setState(processingState);
        order.processOrder();

        OrderState deliveredState = new DeliveredOrderState();
        order.setState(deliveredState);
        order.processOrder();

        OrderState cancelledState = new CancelledOrderState();
        order.setState(cancelledState);
        order.processOrder();
    }
}
