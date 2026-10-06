package week05_02.hw.plane;

public class SupersonicAirplane extends Airplane {

    @Override
    public void fly() {
        super.fly();
        System.out.println("이륙끝.");
    }
}
