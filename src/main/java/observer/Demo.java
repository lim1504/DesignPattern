package observer;

import observer.editor.Editor;
import observer.listeners.EmailNotificationListener;
import observer.listeners.LogOpenListener;

/**
 * 클라이언트는 런타임환경에 구독자들을 설정할 수 있다.
 */
public class Demo {
    public static void main(String[] args) {
        //구독자는 동적으로 컴파일된다.
        Editor editor = new Editor();
        editor.event.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.event.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try{
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
