package observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * 실질적인 알림 및 뉴스레터 객체와 관련된 비지니스 로직을 수행하는 객체
 */
public class ConcreteSubject implements NewLatterPublisher {

    List<ObserverSubject> list = new ArrayList<>();

    @Override
    public void subscribe(ObserverSubject os) {
        list.add(os);
        System.out.println("[" + os.toString() + "]" + "구독완료");
    }

    @Override
    public void unsubscribe(ObserverSubject os) {
        list.remove(os);
        System.out.println("[" + os.toString() + "]" + "구독취소");
    }

    @Override
    public void notification() {
        for (ObserverSubject os : list) {
            os.update();
        }
    }
}
