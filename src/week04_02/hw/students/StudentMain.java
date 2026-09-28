package week04_02.hw.students;

public class StudentMain {
    public static void main(String[] args) {
        Students st1 = new Students("Mr. J");
        st1.setScores(60, 60, 60);
        st1.getInfo();
        st1.getStats();
    }
}
