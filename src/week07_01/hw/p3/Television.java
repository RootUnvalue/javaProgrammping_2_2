package week07_01.hw.p3;

public class Television implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("tv on.");
    }

    @Override
    public void turnOff() {
        System.out.println("tv off.");
    }
}
