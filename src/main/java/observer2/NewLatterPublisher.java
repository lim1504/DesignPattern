package observer2;

/**
 * 뉴스레터 발행 주체이다.
 * 알림을 주는 주체
 */
public interface NewLatterPublisher {

    // 구독자 저장
    void subscribe(ObserverSubject os);

    // 구독자 제거
    void unsubscribe(ObserverSubject os);

    // 알림설정
    void notification();
}
