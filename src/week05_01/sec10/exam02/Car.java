package week05_01.sec10.exam02;

public class Car {
    int speed;

    void run() {
        this.speed = 100;
        System.out.println("car is going");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speed = 200;
        myCar.run();
    }
}
