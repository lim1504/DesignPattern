package observer.listeners;

import java.io.File;

/**
 * 알림을 받는 객체
 * 어떤 알림을 받을것인지에 대한 작업 수행
 * 모든 클래스는 알림 주체가 응답객체와 결합하지 않도록
 */
public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed "
                + eventType + " operation with the following file: " + file.getName());
    }
}
