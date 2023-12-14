package singleton;

/**
 * 싱글 스레드인 경우
 */
public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.value = value;
    }

    public static Singleton getSingleton(String value) {

        if (instance == null) {
            instance = new Singleton(value);
        }

        return instance;
    }
}
