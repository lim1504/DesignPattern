package observer.publisher;

import observer.listeners.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 기초 게시자, 알림 발행 주체
 *
 * 다른 객체들에 관심 이벤트들을 발행합니다.
 * 상태를 전환하거나, 어떤 행동을 실행할 경우 발생합니다.
 *
 */
public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    //이벤트를 발생시킬 상태정보
    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    //구독자 혹은 알림을 받을 사람목록 작성
    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    //더이상 알림을 받지 않는 사람 제거
    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    //알림정보
    public void notify(String eventType, File file) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}
