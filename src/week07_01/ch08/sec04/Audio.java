package week07_01.ch08.sec04;

public class Audio implements RemoteControl{

    // turnOn() override.
    @Override
    public void turnOn() {
        System.out.println("audio on");
    }

    // turnOff() override.
    @Override
    public void turnOff() {
        System.out.println("audio off");
    }

    // setVol() override.
    @Override
    public void setVol(int vol) {
        // field
        int vol1;
        if(vol>RemoteControl.MAX_VOL) {
            vol1 = RemoteControl.MAX_VOL;
        } else if(vol<RemoteControl.MIN_VOL) {
            vol1 = RemoteControl.MIN_VOL;
        } else {
            vol1 = vol;
        }
        System.out.println("now vol: " + vol1);
    }
}
