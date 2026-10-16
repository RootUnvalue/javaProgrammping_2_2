package week07_02.ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {

    // turnOn() override
    @Override
    public void turnOn() {
        System.out.println("Tv on");
    }

    // turnOff() override
    @Override
    public void turnOff() {
        System.out.println("Tv off");
    }

    // search() override
    @Override
    public void search(String url) {
        System.out.println("Searching : " + url );
    }
}
