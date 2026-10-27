package week09_01.ch09.sec05.exam01;

public class AExample {
    public static void main(String[] args) {
        A_b a = new A_b();
        A_b.B b = a.new B();
        b.method();

        A_b.C c = new A_b.C();
        c.method();
    }
}
