package facade;

import facade.Common.OrderFoodInfo;
import facade.Common.OrderType;
import facade.Common.PayType;
import facade.lib.Order;
import facade.lib.Payment;

/**
 * 라이브러리 정보를 심플하게 가공할 퍼사드 클래스 객체
 * 모든 기능의 집합체이자, 재정의 클래스
 * 실질적으로 Client 와 소통하는 객체
 *
 * 1. 주문
 * 2. 결제
 */
public class Facade {

    Order order = new Order();
    Payment payment = new Payment();

    public String ordering (OrderType orderType, PayType payType, OrderFoodInfo orderFood) {
        String orderId =  "A" + (int) ((Math.random() * 10000) + 1);

        //주문
        String id = order.orderInfo(orderId, orderType.name(), orderFood.getFoodName(), orderFood.getFoodPrice());

        //결제
        int orderTotal = payment.process(payType, order.getOrderInfo(id));

        return "주문번호 " + id + " 결제가 완료되었습니다." + "[ " + orderTotal + "원 ]";
    }
}
