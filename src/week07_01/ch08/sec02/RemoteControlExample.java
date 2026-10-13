package week07_01.ch08.sec02;

public class RemoteControlExample {

    public static void main(String[] args) {
        RemoteControl rc;

        // rc <- Television
        rc = new Television();
        rc.turnOn();

        // rc <- Audio
        rc = new Audio();
        rc.turnOn();
    }
}