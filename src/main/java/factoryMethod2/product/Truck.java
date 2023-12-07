package factoryMethod2.product;

/**
 * 제품별로 기능을 확장한다.
 */
public class Truck implements Transit{
    @Override
    public void delivery() {
        System.out.println("육지로 배송중입니다.");
    }

    @Override
    public void unloading() {
        System.out.println("짐을 사람이 내리는 중입니다.");
    }
}
