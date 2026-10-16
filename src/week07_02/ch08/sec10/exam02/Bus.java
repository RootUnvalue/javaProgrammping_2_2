package week07_02.ch08.sec10.exam02;

public class Bus implements Vehicle {

    // override abstract method
    @Override
    public void run() {
        System.out.println("Bus run");
    }

    // additional method
    public void checkFare() {
        System.out.println("check fare");
    }
}
