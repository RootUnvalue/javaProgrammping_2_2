package week05_02.hw.mobile;

public class Phone {
    String model, color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void bell() {
        System.out.println("Ring- Ring-");
    }

    public void call() {
        System.out.println("화면을 키고 전화를 걸다.");
    }
}
