package factoryMethod.factory;

import factoryMethod.buttons.Button;
import factoryMethod.buttons.HtmlButton;

/**
 * Html Dialog는 Button 인터페이스의 Html버튼생성 원리를 따른다.
 */
public class HtmlDialog extends Dialog{

    //결과를 반영하기 위한 재정의
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
