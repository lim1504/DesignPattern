package facade.Common;

/**
 * 주문 내용을 지정하기 위한 열거형 클래스
 * 주문 음식은 3가지로 규정
 */
public enum OrderFoodInfo {

    PIZZA("PIZZA", 20000),
    CHICKEN("CHICKEN", 15000),
    HAMBURGER("HAMBURGER", 10000);

    private String foodName;
    private int foodPrice;

    OrderFoodInfo(String foodName, int foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getFoodPrice() {
        return foodPrice;
    }
}
