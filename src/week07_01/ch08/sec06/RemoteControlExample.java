package week07_01.ch08.sec06;

public class RemoteControlExample {
    public static void main(String[] args) {
        // define interface value
        RemoteControl rc;

        // rc <- Television()
        rc = new Television();
        rc.turnOn();
        rc.setVol(5);

        // call default method
        rc.setMute(true);
        rc.setMute(false);
        System.out.println();

        // rc <- Audio()
        rc = new Audio();
        rc.turnOn();
        rc.setVol(5);

        // call default method
        rc.setMute(true);
        rc.setMute(false);
        System.out.println();

        // call static method
        RemoteControl.changeBattery();
    }
}
