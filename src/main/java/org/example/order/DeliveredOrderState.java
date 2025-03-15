package org.example.order;

public class DeliveredOrderState implements OrderState{
    public void handleOrder(OrderContext context) {
        System.out.println("Trạng thái ĐÃ GIAO đơn hàng");
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao");
    }
}
