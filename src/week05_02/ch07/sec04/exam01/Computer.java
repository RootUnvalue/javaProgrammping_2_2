package week05_02.ch07.sec04.exam01;

public class Computer extends Calculator {
    @Override
    public double areaCircle(double r) {
        System.out.println("Com - areaCal() 실행");
        return 3.14 * r * r;
    }
}
