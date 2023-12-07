package factoryMethod2.product;

/**
 * 제품별로 기능을 확장한다.
 */
public class Ship implements Transit{
    @Override
    public void delivery() {
        System.out.println("바다로 배송중입니다.");
    }

    @Override
    public void unloading() {
        System.out.println("크레인이 짐을 내리는 중입니다.");
    }
}
