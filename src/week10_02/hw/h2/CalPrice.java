package week10_02.hw.h2;

public class CalPrice {
    public static void main(String[] args) {
        int price = 5000;
        int count = 0;
        int total_price = price * count;

        try {
            System.out.println("상품 계산을 시작합니다.");
            total_price /= count;
        } catch (ArithmeticException e) {
            System.out.println("구매 수량은 0이 될 수 없습니다.");
        } finally {
            System.out.println("구매 계산이 종료되었습니다.");
        }
    }
}
