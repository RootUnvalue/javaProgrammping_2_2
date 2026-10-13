package week07_01.ch08.sec06;

public class Television implements RemoteControl {

    // field
    private int vol;

    // turnOn() override
    @Override
    public void turnOn() {
        System.out.println("tv on");
    }

    // turnOff() override
    @Override
    public void turnOff() {
        System.out.println("tv off");
    }

    //setVol() override
    @Override
    public void setVol(int vol) {
        if(vol> RemoteControl.MAX_VOL) {
            this.vol = RemoteControl.MAX_VOL;
        } else if (vol< RemoteControl.MIN_VOL) {
            this.vol = RemoteControl.MIN_VOL;
        } else {
            this.vol = vol;
        }
        System.out.println("now vol: " + this.vol);
    }
}
