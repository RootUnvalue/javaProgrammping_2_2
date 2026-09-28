package week04_02.hw.students;

import java.util.Scanner;

public class Students {
    Scanner sc = new Scanner(System.in);
    String name;
    int korean = 0;
    int english = 0;
    int math = 0;

    public void getInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("국어 성적 : " + this.korean);
        System.out.println("영어 성적 : " + this.english);
        System.out.println("수학 성적 : " + this.math);
    }

    public void getStats() {
        System.out.println("총점 : " + (korean + english + math));
        System.out.println("평균점수 : " + ( korean + english + math ) / 3.0);
        System.out.println("통과여부 : "+ ((((korean + english + math) / 3.0) >= 60) ? "통" : "불통"));
    }

    public void setScores(int kr, int en, int ma) {
        this.korean = kr;
        this.english = en;
        this.math = ma;
    }

    public Students(String name, int kr, int en, int ma) {
        this.name = name;
        this.korean = kr;
        this.english = en;
        this.math = ma;
    }

    public Students(String name) {
        this.name = name;
    }

    public Students() {
        this.name = "길동이";
    }
}
