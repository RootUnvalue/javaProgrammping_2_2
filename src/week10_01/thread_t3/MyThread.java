package week10_01.thread_t3;

public class MyThread extends Thread {

    private String name;
    private int start;
    private MyEvent listener;

    public MyThread(MyEvent listener) {
        this.name = "default";
        this.start = 100;
        this.listener = listener;
    }

    public MyThread(String name, MyEvent listener) {
        this.name = name;
        this.start = 100;
        this.listener = listener;
    }

    public MyThread(int start, MyEvent listener) {
        this.name = "default";
        this.start = start;
        this.listener = listener;
    }

    public MyThread(String name, int start, MyEvent listener) {
        this.name = name;
        this.start = start;
        this.listener = listener;
    }

    @Override
    public void run() {
        try {
            for (int i = this.start; i < this.start + 10; i++) {
                System.out.println(this.name + " 에서 출려역 함. " + i);
                sleep(300);
                if (i == this.start + 4) {
                    listener.listen(this.name);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
