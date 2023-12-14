package singleton;

public class SingletonDemo {
    public static void main(String[] args) {

        //1. 싱글 스레드인 경우
//        SingleThread singleThread = new SingleThread ();
//        singleThread.run();

        //2. 멀티 스레드인 경우 - 싱글톤으로 정확히 작동하지 않을 수 있음. (지연로딩 해야함.)
        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());

        threadOne.start();
        threadTwo.start();
    }

    static class SingleThread {
        void run() {
            Singleton singleton = Singleton.getSingleton("A");
            Singleton anOtherSingleton = Singleton.getSingleton("B");

            System.out.println("singleton = " + singleton.value);
            System.out.println("anOtherSingleton = " + anOtherSingleton.value);
        }
    }

    static class ThreadOne implements Runnable {
        @Override
        public void run() {
            Singleton2 singleton = Singleton2.getInstance("A");
            System.out.println("singleton = " + singleton.value);
        }
    }

    static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            Singleton2 singleton = Singleton2.getInstance("B");

            System.out.println("singleton = " + singleton.value);
        }
    }
}
