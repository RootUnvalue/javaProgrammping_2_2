package week10_01.thread_t1;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread(1);
        MyThread thread2 = new MyThread(11);
        MyThread thread3 = new MyThread(21);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
