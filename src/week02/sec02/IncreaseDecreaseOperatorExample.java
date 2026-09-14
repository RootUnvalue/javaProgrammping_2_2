package week02.sec02;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;
        x++;
        ++x;
        System.out.println("x = " + x);

        System.out.println("---".repeat(4));
        y--;
        --y;
        System.out.println("y = " + y);

        System.out.println("---".repeat(4));
        z = x++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("---".repeat(4));
        z = ++x;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("---".repeat(4));
        z = ++x + y++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("---".repeat(4));

    }
}
