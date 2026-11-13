package week10_02.hw.h1;

public class Divider {
    public static void main(String[] args) {
        int num1 = 1, num2 = 0, result;
        try {
            System.out.println("나눗셈을 시작합니다.");
            result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("계산 프로그램을 종료합니다.");
    }
}
