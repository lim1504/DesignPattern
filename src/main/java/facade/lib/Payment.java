package facade.lib;

import facade.Common.DeliveryCommon;
import facade.Common.PayType;

import java.util.HashMap;
import java.util.Objects;

/**
 * 결제 프로세스
 * 1. 음식 정보를 바탕으로 결제 프로세스 진행
 * 2. 주문 타입 지정 (직접결제, 카드)
 * 3. 총 주문 가격 return
 */
public class Payment implements DeliveryCommon {
    int total = 0;
    int charge = 0;
    public int process (PayType payType, OrderList orderInfo) {

        if (Objects.isNull(orderInfo)) return -999;

        String pay = payType.getType();
        charge = pay.equals("DIRECT") ? payType.DIRECT.getCharge() : payType.CARD.getCharge();
        total = orderInfo.getPrice() + charge;

        return total;
    }
}
