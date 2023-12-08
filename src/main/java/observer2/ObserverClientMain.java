package observer2;

/**
 * 클라이언트 코드
 */
public class ObserverClientMain {
    public static void main(String[] args) {
        //1. 발행자정보 명시 -> 알람을 주는 주체는 누구인가?
        NewLatterPublisher nlp = new ConcreteSubject();

        //1-1. 임의의 구독자 생성 (알림받는 객체정보)
        ObserverSubject os1 = new ObserverA();
        ObserverSubject os2 = new ObserverB();
        nlp.subscribe(os1);
        nlp.subscribe(os2);

        //2. 구독자에 한해 알림발송
        nlp.notification();

        //3. 특정 구독자 구독해제
        nlp.unsubscribe(os2);

        //4. 구독자에게 알림 발송
        nlp.notification();
    }
}
