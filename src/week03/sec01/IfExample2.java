package week03.sec01;

import java.util.Scanner;

public class IfExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 입력: ");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("점수가 90보다 큼.");
            System.out.println("Grade A.");
        }
        if (score < 90) {
            System.out.println("점수가 90보다 작음.");
            System.out.println("Grade B.");
        }
    }
}
