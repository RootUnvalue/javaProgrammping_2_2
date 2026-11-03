package week10_01.thread_t3;

public class MyEventListener implements MyEvent {
    public synchronized void listen(String name) {
        System.out.println("*".repeat(4*5));
        System.out.println(name + " 이(가) 절반 실행됨");
        System.out.println("*".repeat(4*5));
    }
}
