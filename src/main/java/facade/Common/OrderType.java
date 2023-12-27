package facade.Common;

/**
 * 주문 방법 열거형 클래스
 * 주문 방법은 2가지 (전화, 앱)
 */
public enum OrderType {
    CALL ("CALL"),
    APP ("APP");

    private String type;

    OrderType(String type) {
        this.type = type;
    }

}
