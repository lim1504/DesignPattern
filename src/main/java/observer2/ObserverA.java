package observer2;

/**
 * 알림을 받을 객체
 */
public class ObserverA implements ObserverSubject{
    @Override
    public void update() {
        System.out.println("[To.ObserverA] 알림을 받았습니다.");
    }

    @Override
    public String toString() {
        return "ObserverA";
    }
}
