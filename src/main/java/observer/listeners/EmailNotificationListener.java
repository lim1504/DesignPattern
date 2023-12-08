package observer.listeners;

import java.io.File;

/**
 * 알림을 받는 객체
 * 어떤 알림을 받을것인지에 대한 작업 수행
 * 모든 클래스는 알림 주체가 응답객체와 결합하지 않도록
 */
public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone hass performed "
                + eventType + " operation with the following file: " + file.getName());
    }
}
