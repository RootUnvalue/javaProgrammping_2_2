package week06_02.ch07.sec10.exm02;

public class Dog extends Animal {

    // 추상메소드 재정의
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
