package week07_01.hw.p3;

public interface RemoteControl {
    void turnOn();
    void turnOff();

    default void mute() {
        System.out.println("muted.");
    }
}
