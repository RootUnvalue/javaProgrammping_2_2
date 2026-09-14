package week03.sec01;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if(score >= 90){
            System.out.println("점수: 100~90");
            System.out.println("Grade A.");
        } else if (score >= 80){
            System.out.println("점수: 80~89");
            System.out.println("Grade B.");
        } else if (score >= 70){
            System.out.println("점수: 70~79");
            System.out.println("Grade C.");
        } else {
            System.out.println("점수 70 미만.");
            System.out.println("Grade D.");
        }
    }
}
