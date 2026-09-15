package week03.sec01;

import java.util.Scanner;

public class SwitchCaseYieldTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("월 입력");
        int month  = sc.nextInt();

        int day = switch (month) {
            case 1,3,5,7,8,10,12 -> {
                System.out.println("한 달은 31일");
                yield 31;
            }

            case 4,6,9,11 -> {
                System.out.println("한 달은 30일");
                yield 30;
            }

            case 2 -> {
                System.out.println("한 달은 28일");
                yield 28;
            }

            default -> {
                System.out.println("존재하지 않음");
                yield 0;
            }

        };

        System.out.println(month + "월은 " + day + " 일 입니다.");
        sc.close();
    }
}
