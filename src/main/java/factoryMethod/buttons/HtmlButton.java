package factoryMethod.buttons;

/**
 * HTML 형식의 제품 기능 구현 및 확장
 */
public class HtmlButton implements Button {
    public void render() {
        System.out.println("Button Created !");
        onClick();
    }

    public void onClick() {
        System.out.println("Button Clicked !");
    }
}
