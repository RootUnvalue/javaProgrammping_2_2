package week03.sec01;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
//        int score = 85;
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 입력: ");
        int score = sc.nextInt();
        if(score >= 90) {
            System.out.println("점수가 90보다 큼.");
            System.out.println(("Grade A."));
        } else {
            System.out.println("점수가 90보다 작음.");
            System.out.println(("Grade B."));
        }
    }
}
