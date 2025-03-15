package org.example.order;

public class NewOrderState implements OrderState{
    public void handleOrder(OrderContext context) {
        System.out.println("Kiểm tra thông tin đơn hàng...");
        context.setState(new ProcessingOrderState());
    }


}
