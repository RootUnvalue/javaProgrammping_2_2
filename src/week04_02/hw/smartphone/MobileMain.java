package week04_02.hw.smartphone;

import java.util.Scanner;

public class MobileMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char act;
        Mobile mobile = new Mobile("셈승");
        while(true) {
            System.out.println("1. 스마트폰 정보 | 2. 스마트폰 사용 | 3. 스마트폰 충전 | 4. 종료");
            System.out.println("행동입력: ");
            act = sc.next().charAt(0);
            switch (act) {
                case '1' -> mobile.infoMobile();
                case '2' -> {
                    System.out.println("얼마나 사용? (단위: %) : ");
                    mobile.useMobile(sc.nextInt());
                }
                case '3' -> {
                    System.out.println("얼마나 충전? (단위: %) : ");
                    mobile.chargeMobile(sc.nextInt());
                }
                case '4' -> {
                    System.out.println("종료");
                    System.exit(0);
                }
                default -> {
                    System.out.println("잘못된 명령. 다시 입력");
                }
            }
        }
    }
}
