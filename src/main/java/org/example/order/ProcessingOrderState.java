package org.example.order;

public class ProcessingOrderState implements  OrderState {
    public void handleOrder(OrderContext context) {
        System.out.println("Trạng thái ĐANG XỬ LÝ đơn hàng");
        System.out.println("Đóng gói và vận chuyển đơn hàng...");
        context.setState(new DeliveredOrderState());
    }
}
