package week07_01.ch08.sec04;

public interface RemoteControl {

    // const fields
    int MAX_VOL = 10;
    int MIN_VOL = 0;

    // abstract methods
    void turnOn();
    void turnOff();
    void setVol(int vol);
}
