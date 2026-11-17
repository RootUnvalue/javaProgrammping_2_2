package week12_01.ch13.sec04;

public class GenericExample {
    public static <T extends Number> boolean compare(T t1, T t2) {
        System.out.println("Comparing " + t1.getClass().getSimpleName() + " and " + t2.getClass().getSimpleName());
        double d1 = t1.doubleValue();
        double d2 = t2.doubleValue();
        return d1 == d2;
    }

    public static void main(String[] args) {
        System.out.println(compare(10, 20) + "\n");
        System.out.println(compare(4.5, 5.5) + "\n");
    }
}
