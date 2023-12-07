package factoryMethod2.product;

/**
 * 제품이 가져야할 공통 기능을 작정하는 인터페이스
 *
 * 1. 배송역할 추가
 * 2. 하역역할 추가
 */
public interface Transit {

    void delivery();

    void unloading();
}
