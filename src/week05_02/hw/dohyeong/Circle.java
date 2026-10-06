package week05_02.hw.dohyeong;

public class Circle extends Shape {
    @Override
    public void area() {
        super.area();
        System.out.println("정의하다! 원의 구역!");
        System.out.println("r = 10 넓이 " + (Math.PI * 100));
    }
}
