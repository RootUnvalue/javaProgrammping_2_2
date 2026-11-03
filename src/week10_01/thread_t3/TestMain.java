package week10_01.thread_t3;

public class TestMain {
    public static void main(String[] args) {
        MyEvent eventListener = new MyEventListener();

        MyThread thread1 = new MyThread("Thread1", 1, eventListener);
        MyThread thread2 = new MyThread(11, eventListener);
        MyThread thread3 = new MyThread("Thread3", eventListener);
        MyThread thread4 = new MyThread(eventListener);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
