package week10_01.thread_t1;

public class MyThread extends Thread {

    private int num;

    public MyThread(int num) {
        this.num = num;
    }

    public void run() {
        for (int i = num; i <= num+9; i++) {
            System.out.println("i 의 갑은 " + i + " 이다.");
        }
    }
}
