package week05_01.hw.students;

public class StudentMain {
    public static void main(String[] args) {
        Student kim = new Student("KIM", 100);
        Student jan = new Student("JAN", 50);
        Student jul = new Student("JUL", 70);

        kim.info();
        jan.info();
        jul.info();
    }
}
