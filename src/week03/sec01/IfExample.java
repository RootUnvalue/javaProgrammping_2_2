package week03.sec01;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;
        if(score >= 90) {
            System.out.println("점수가 90보다 큼.");
            System.out.println("Grade A.");
        }
        if(score < 90) {
            System.out.println("점수가 90보다 작음.");
            System.out.println("Grade B.");
        }
    }
}
