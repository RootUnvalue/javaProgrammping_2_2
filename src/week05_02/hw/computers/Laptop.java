package week05_02.hw.computers;

public class Laptop extends Computer {

    @Override
    public void start() {
        super.start();
        System.out.println("배터리로 작동하다!");
    }
}
