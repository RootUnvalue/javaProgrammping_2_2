package week05_01.hw.students;

public class Student {
    static int ID = 1;

    String name;
    int id;
    int score;

    void info() {
        System.out.println("---".repeat(4));
        System.out.println("Name : " + this.name);
        System.out.println("ID : " + this.id);
        System.out.println("Score : " + this.score);
        System.out.println("---".repeat(4));
    }

    Student(String name, int score) {
        this.name = name;
        this.id = ID++;
        this.score = score;
    }

    Student(String name) {
        this.name = name;
        this.id = ID++;
        this.score = 0;
    }

    Student() {
        this.name = "Nan";
        this.id = ID++;
        this.score = 0;
    }
}
