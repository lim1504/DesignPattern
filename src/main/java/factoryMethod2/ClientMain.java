package factoryMethod2;

import factoryMethod2.creator.RoadTransportManager;
import factoryMethod2.creator.SeaTransportManager;
import factoryMethod2.creator.TransportManager;
import factoryMethod2.product.Transit;

/**
 * 클라이언트 코드
 * 역할에 따라 구분된 내용을 사용할 수 있음.
 * 해당 객체가 생성, 구성 및 표현되는 방식과 독립적이어야하는 경우 유용
 * 클래스가 인스턴스 인스턴스화 책임을 하위 클래스에 위임할 수 있음.
 */
public class ClientMain {
    static final String DELIVERY_TYPE = "ROAD";
    public static void main(String[] args) {

        if(DELIVERY_TYPE.equals("ROAD")) {
            RoadTransport();
        } else {
            SeaTransport();
        }
    }

    private static void SeaTransport() {
        TransportManager rm = new SeaTransportManager();
        Transit ts = rm.createTransit();
        ts.delivery();
        ts.unloading();
    }

    private static void RoadTransport() {
        TransportManager rm = new RoadTransportManager();
        Transit ts = rm.createTransit();
        ts.delivery();
        ts.unloading();
    }
}
