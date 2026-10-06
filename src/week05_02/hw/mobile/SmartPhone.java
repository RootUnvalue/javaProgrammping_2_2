package week05_02.hw.mobile;

public class SmartPhone extends Phone {

    public SmartPhone(String model, String color) {
        super(model, color);
    }

    public void internet() {
        System.out.println("In! ter!! net!!!!");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("전화연결중~");
    }
}
