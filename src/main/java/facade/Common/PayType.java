package facade.Common;

/**
 * 결제수단 열거형 클래스
 * 1. 결제수단은 2가지로 한정
 * 2. 수수료지정
 */
public enum PayType {
    DIRECT("DIRECT", 1000),
    CARD("CARD", 2000);

    private String type;
    private int charge;

    PayType(String type, int charge) {
        this.type = type;
        this.charge = charge;
    }

    public String getType() {
        return type;
    }

    public int getCharge() {
        return charge;
    }
}
