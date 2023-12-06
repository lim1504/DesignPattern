package factoryMethod.factory;

import factoryMethod.buttons.Button;
import factoryMethod.buttons.WindowButton;

/**
 * Window는 Window Dialog 생성
 */
public class WindowsDialog extends Dialog {

    //결과를 변경하기 위한 재정의
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
