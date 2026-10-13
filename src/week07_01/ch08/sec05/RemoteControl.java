package week07_01.ch08.sec05;

public interface RemoteControl {

    // const field
    int MAX_VOL = 10;
    int MIN_VOL = 0;

    // abstract methods
    void turnOn();
    void turnOff();
    void setVol(int vol);

    // default method
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("mute");
            // call abstract method and use const field
            setVol(MIN_VOL);
        } else {
            System.out.println("unmute");
        }
    }
}
