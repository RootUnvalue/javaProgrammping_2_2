package week05_02.hw.vehicles;

public class Vehicle {

    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public Vehicle(){
        System.out.println("Vehicle() 실행");
    }
    public void start() {
        System.out.println("Engine Start");
    }

    public void move() {
        System.out.println("Vehicle Move");
    }

    public void drive() {
        System.out.println("부산항 대교에 드라이브 갑니다.");
    }
}
