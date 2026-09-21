package week03.sec02;

public class Args {
    public static void main(String[] args) {
        int coin1 = Integer.parseInt(args[0]);
        int coin2 = Integer.parseInt(args[1]);
        int coin3 = Integer.parseInt(args[2]);
        int sum = coin1 + coin2 + coin3;
        int over = sum - 5000;
        System.out.println("예산은 5000원입니다");
        if (sum > 5000) {
            System.out.println(over + "예산은 5000원입니다");
        } else {
            System.out.println("총" + sum + "원으로 구매기능합니다");
        }
    }
}
