package factoryMethod;

import factoryMethod.factory.Dialog;
import factoryMethod.factory.HtmlDialog;
import factoryMethod.factory.WindowsDialog;

/**
 * 현재 설정 또는 환경에 따라 제품 유형을 결정
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * 모든 클라이언트 코드는 다음을 통해 팰토리 및 제품과 함꼐 작동해야한다.
     * 어떤 제품을 반환하는지, 어떤 작업을하는지 알필요가 없다.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
}
