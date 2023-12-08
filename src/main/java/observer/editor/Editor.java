package observer.editor;

import observer.publisher.EventManager;

import java.io.File;

/**
 * 실제 비지니스 로직을 포함한다.
 */
public class Editor {
    public EventManager event;
    private File file;

    public Editor() {
        this.event = new EventManager("open", "save");
    }

    //비지니스 로직의 메소드
    //구독자에게 변경사항을 알림.
    public void openFile(String filePath) {
        this.file = new File(filePath);
        event.notify("open", file);
    }

    public void saveFile() throws Exception {
        if(this.file != null) {
            event.notify("save", this.file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
