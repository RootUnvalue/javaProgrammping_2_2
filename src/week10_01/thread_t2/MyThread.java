package week10_01.thread_t2;

import java.util.Random;

public class MyThread extends Thread {

    private int num;

    public MyThread(int num) {
        this.num = num;
    }

    public void run() {
        Random random = new Random();
        for (int i = num; i <= num+9; i++) {
            try {
                sleep(random.nextInt(10));
            } catch (Exception e) { }
            System.out.println("i 의 갑은 " + i + " 이다.");
        }
    }
}
