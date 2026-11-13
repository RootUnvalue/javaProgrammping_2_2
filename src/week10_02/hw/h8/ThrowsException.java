package week10_02.hw.h8;

public class ThrowsException {
    public static void main(String[] args) {
        try {
            System.out.println("10 / 0 을 수행");
            method1();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }

        System.out.println("종료");
    }

    static void method1() throws ArithmeticException {
        method2();
    }

    static void method2() throws ArithmeticException{
        method3();
    }

    static void method3() {
        int i = 10 / 0;
    }
}
