package singleton;

/**
 * 멀티스레드인 경우, 스레드간 경쟁상태를 피하기 위한 잠금 조치 필수
 */
public class Singleton2 {
    private static volatile Singleton2 instance;

    public String value;

    private Singleton2(String value) {
        this.value = value;
    }

    public static Singleton2 getInstance (String value) {

        Singleton2 result = instance;

        if (result != null) {
            return result;
        }
        synchronized (Singleton2.class) {
            if (instance == null) {
                instance = new Singleton2(value);
            }
            return instance;
        }
    }
}
