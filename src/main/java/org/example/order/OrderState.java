package org.example.order;

public interface OrderState {
    void handleOrder(OrderContext context);
}
