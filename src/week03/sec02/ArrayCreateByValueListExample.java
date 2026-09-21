package week03.sec02;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Autumn", "Winter"};
        System.out.println("season[0] : " + season[0]);
        System.out.println("season[1] : " + season[1]);
        System.out.println("season[2] : " + season[2]);
        System.out.println("season[3] : " + season[3]);

        season[1] = "여름";
        System.out.println("season[1] : " + season[1]);
        System.out.println("");

        int[] scores = {83,90,87};
        int sum = 0;
        for(int i : scores){
            sum += i;
        }
        System.out.println("sum : " + sum);
        System.out.println("average : " + 1.0 * sum / scores.length);
    }
}
