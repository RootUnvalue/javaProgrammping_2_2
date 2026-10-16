package week07_02.ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {

        // def interface variable, var <- implemented class
        Vehicle vehicle = new Bus();

        // call method through interface
        vehicle.run();
//        vehicle.checkFare(); // cant use

        // Explicit casting
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();

        System.out.println( (bus instanceof Bus) );
    }
}
