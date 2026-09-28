package week04_02.hw.getround;

public class RoundMain {
    public static void main(String[] args) {
        Round rd = new Round();
        int a = 1;
        int b = 1;

        System.out.println("변 a : " + a + " cm, 변 b : " +  b + " cm 인");
        System.out.println("직각 삼각형의 둘레 : " + rd.getRound(a,b));
        System.out.println("한 변이 "+ a +" cm인 정삼각형인 경우 둘레 : " + rd.getRound(a));
    }
}
