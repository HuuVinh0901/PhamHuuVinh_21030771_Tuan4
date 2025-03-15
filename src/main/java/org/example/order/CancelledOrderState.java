package org.example.order;

public class CancelledOrderState implements OrderState{
    public void handleOrder(OrderContext context) {
        System.out.println("Trạng thái HỦY đơn hàng");
        System.out.println("Hủy đơn hàng và hoàn tiền...");
    }
}
