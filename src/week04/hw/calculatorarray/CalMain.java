package week04.hw.calculatorarray;

import java.util.Arrays;

public class CalMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int[] v = new int[] {1,2,3,4,5};
        System.out.println(
                "v = " + Arrays.toString(v)+ "\n" +
                "v + ... = " + cal.sum(v) + "\n" +
                "v - ... = " +  cal.sub(v) + "\n" +
                "v * ... = "  + cal.mul(v) + "\n" +
                "v / ... = " + cal.div(v) + "\n"
        );
    }
}
