package week04_02.hw.calculator;

public class CalMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int a = 10, b = 20;
        System.out.println(
                "a = " + a + " , b = " + b + "\n" +
                "a + b = " + cal.sum(a, b) + "\n" +
                "a - b = " +  cal.sub(a, b) + "\n" +
                "a * b = "  + cal.mul(a, b) + "\n" +
                "a / b = " + cal.div(a, b) + "\n"
        );
    }
}
