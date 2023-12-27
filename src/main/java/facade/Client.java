package facade;

import facade.Common.OrderFoodInfo;
import facade.Common.OrderType;
import facade.Common.PayType;

/**
 * 클라이언트 객체
 *
 * 사용자는 주문만 진행하면 된다.
 * 결제 프로세스에 대해서는 알 필요가 없음
 */
public class Client {
    public static void main(String[] args) {

        Facade facade = new Facade();

        //1. 피자 직접 주문, 직접결제
        String PizzaOrder = facade.ordering(OrderType.CALL, PayType.DIRECT, OrderFoodInfo.PIZZA);
        System.out.println("PizzaOrder = " + PizzaOrder);
        
        //2. 치킨 앱 주문, 카드결제
        String chickenOrder = facade.ordering(OrderType.APP, PayType.CARD, OrderFoodInfo.CHICKEN);
        System.out.println("chickenOrder = " + chickenOrder);
    }
}
