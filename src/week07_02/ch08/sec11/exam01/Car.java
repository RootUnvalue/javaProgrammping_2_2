package week07_02.ch08.sec11.exam01;

public class Car {

    // field
    Tire tire1 = new HKTire();
    Tire tire2 = new HKTire();

    void run(){
        tire1.roll();
        tire2.roll();
    }
}
