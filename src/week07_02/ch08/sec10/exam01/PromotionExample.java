package week07_02.ch08.sec10.exam01;

public class PromotionExample {
    public static void main(String[] args) {

        // object implements
        B b = new B();
        C c = new C();
        D d = new D();
        E e  = new E();


        // interface variable
        A a;

        // a <- class implemented by interface
        a = b; // B -> A (Implicit)
        a = c; // C -> A (Implicit)
        a = d; // D -> A (Implicit)
        a = e; // E -> A (Implicit)
    }
}
