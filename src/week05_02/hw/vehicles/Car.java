package week05_02.hw.vehicles;

public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    public Car() {
        super();
        System.out.println("Car() 실행");
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void move() {
        System.out.println("자동차는 네 바퀴로 무빙~");
    }

    @Override
    public void drive() {
        super.drive();
    }

    public final void stop() {
        System.out.println("자동차 (이)가 무빙을 멈추다!");
    }
}
