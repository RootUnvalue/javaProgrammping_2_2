package week04_02.hw.foods;

import java.util.Scanner;

public class FdMain {
    public static void main(String[] args) {
        Storage fd = new Storage();
        Scanner sc = new Scanner(System.in);
        char act;
        while (true) {
            System.out.println("명령");
            System.out.println("1. 재고상황 | 2. 재고소진 | 3. 종료");
            System.out.println("입력: ");
            act = sc.next().charAt(0);
            switch (act) {
                case '1' -> fd.getIngredients();
                case '2' -> {
                    System.out.println("1.김치찌개 | 2.된장찌개 3.제육볶음 | 4.계란찜");
                    System.out.println("메뉴 선택(숫자):");
                    int menu = sc.nextInt();
                    System.out.println("사용할 개수: ");
                    int count = sc.nextInt();
                    fd.useIngredient((menu - 1), count);
                }
                case '3' -> {
                    System.out.println("종료");
                    System.exit(0);
                }
                default -> {
                    System.out.println("잘못된 명령");
                }
            }
        }
    }
}
