package week09_01.ch09.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.run1();
        car.run2();
        car.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("Unknown Child Tire Object 3 rolls");
            }
        });
    }
}
