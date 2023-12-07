package factoryMethod.buttons;

/**
 * 모든 버튼이 가지는 공통적인 사항
 *
 * 제품이 가지는 공통 기능 인터페이스
 */
public interface Button {
    void render();
    void onClick();
}
