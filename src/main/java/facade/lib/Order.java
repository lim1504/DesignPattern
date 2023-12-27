package facade.lib;

import facade.Common.DeliveryCommon;

import java.util.HashMap;

/**
 * 주문에 대한 상세기능 정보
 * 주문정보 담기
 */
public class Order implements DeliveryCommon {
    HashMap<String, OrderList> map = new HashMap<>();

    public String orderInfo (String orderId, String orderType, String orderFood, int price) {
        map.put(orderId, new OrderList(orderType, orderFood, price));

        return orderId;
    }

    public OrderList getOrderInfo(String orderId) {

        return map.get(orderId);
    }
}

/**
 * 주문 상세정보
 */
class OrderList {
    private String orderType;
    private String orderFood;
    private int price;

    public OrderList(String orderType, String orderFood, int price) {
        this.orderType = orderType;
        this.orderFood = orderFood;
        this.price = price;
    }

    public String getOrderType() {
        return orderType;
    }

    public String getOrderFood() {
        return orderFood;
    }

    public int getPrice() {
        return price;
    }
}
