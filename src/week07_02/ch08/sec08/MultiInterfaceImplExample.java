package week07_02.ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        // define RemoteControl interface value
        // rc <- SmartTelevision
        RemoteControl rc = new SmartTelevision();

        // can use only abstract methods defined RemoteControl interface
        rc.turnOn();
        rc.turnOff();

//        rc.search(); // cant use

        // define Searchable interface value
        // searchable <- SmartTelevision
        Searchable searchable = new SmartTelevision();

        // can use only defined abstract methods defined Searchable interface
        searchable.search("http://www.google.com");

//        searchable.turnOn(); // cant use
//        searchable.turnOff(); // cant use
    }
}
