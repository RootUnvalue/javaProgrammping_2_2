package week03.sec02;

import java.util.Scanner;

public class ScoreAnalyzer {
    static Scanner scanner = new Scanner(System.in);
    static int studentNum = 0;
    static int[] scores = new int[0];

    public static void setStudentNum() {
        System.out.println("학생 수 입력: ");
        studentNum = scanner.nextInt();
        scores = new int[studentNum];
    }
    static void printMenu() {
        System.out.println("---".repeat(4));
        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
        System.out.println("---".repeat(4));
    }

    static int selMenu() {
        System.out.print("선택> ");
        int sel = scanner.nextInt();
        System.out.println("");
        return sel;
    }

    static void setScores() {
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + " 번 재 학생의 성적 입력: ");
            scores[i] = scanner.nextInt();
        }
        System.out.println("끝");
    }
    static void printScores() {
        for(int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + (i + 1) + "]: " + scores[i]);
        }
    }

    static void analyze() {
        int sum = 0;
        int max = scores[0];
        for(int i : scores) {
            if(i > max) {
                max = i;
            }
            sum += i;
        }
        double average = 1.0 * sum / scores.length;

        System.out.println("max: " + max);
        System.out.println("average: " + average);
    }

    public static void main(String[] args) {
        while (true) {
            printMenu();
            switch (selMenu()) {
                case 1 -> setStudentNum();
                case 2 -> setScores();
                case 3 -> printScores();
                case 4 -> analyze();
                case 5 -> {
                    System.out.println("명령종료");
                    System.exit(0);
                }
                default -> System.out.println("잘못된 명령");
            }
        }
    }
}
