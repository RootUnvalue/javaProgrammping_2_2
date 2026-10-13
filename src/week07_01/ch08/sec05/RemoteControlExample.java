package week07_01.ch08.sec05;

public class RemoteControlExample {
    public static void main(String[] args) {

        // define interface value
        RemoteControl rc;

        // rc <- Television()
        rc = new Television();
        runCommand(rc);

        // rc <- Audio()
        rc = new Audio();
        runCommand(rc);
    }

    static void runCommand(RemoteControl rc) {
        rc.turnOn();
        rc.setVol(5);

        // call default methods
        rc.setMute(true);
        rc.setMute(false);
        System.out.println();
    }
}
