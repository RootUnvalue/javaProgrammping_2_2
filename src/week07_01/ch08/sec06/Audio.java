package week07_01.ch08.sec06;

public class Audio implements RemoteControl {

    //field
    private int memVol;
    private int vol;

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
        if(vol> RemoteControl.MAX_VOL) {
            this.vol = RemoteControl.MAX_VOL;
        } else if(vol< RemoteControl.MIN_VOL) {
            this.vol = RemoteControl.MIN_VOL;
        } else {
            this.vol = vol;
        }
        System.out.println("now vol: " + vol);
    }

    // setMute() override
    @Override
    public void setMute(boolean mute) {
        if(mute) {
            this.memVol = this.vol;
            System.out.println("mute.");
            setVol(RemoteControl.MIN_VOL);
        } else {
            System.out.println("unmute.");
            setVol(this.memVol);
        }
    }
}
