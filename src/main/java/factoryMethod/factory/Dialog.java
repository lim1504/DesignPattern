package factoryMethod.factory;

import factoryMethod.buttons.Button;

/**
 * 팩토리 클래스 (크리에이터 클래스)
 * 단지 클래스의 역할을 할 뿐
 * 다양한 제품을 필요로하는 핵심 비지니스 로직이 있어야함. (Dialog 생성)
 *
 * 제품에 따라서 변경이 일어나서는 안된다. 역할은 똑같이 수행해야한다.
 */
public abstract class Dialog {

    // 제품을 생성하는 것이 주 목적이 아님.
    // 다른 유형의 제품을 반환하여 해당 비지니스 로직을 간접적으로 변경
    public void renderWindow() {
        //윈도우 형식의 버튼 생성방법 지정
        Button button = createButton();
        button.render();
    }

    /**
     * 팩토리 클래스에서 특정 버튼 생성을 재정의할 수 있다.
     * @return
     */
    public abstract Button createButton();
}
