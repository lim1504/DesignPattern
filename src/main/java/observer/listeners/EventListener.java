package observer.listeners;

import java.io.File;

/**
 * 발생되는 새로운 이벤트 정보
 * 일관된 정보활용을 위한 호출
 */
public interface EventListener {
    void update(String eventType, File file);
}
