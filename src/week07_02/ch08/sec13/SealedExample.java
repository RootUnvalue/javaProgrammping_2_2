package week07_02.ch08.sec13;

public class SealedExample {
    public static void main(String[] args) {
        ImplClass impl = new ImplClass();

        InterfaceA la = impl;
        la.methodA();

        System.out.println();

        InterfaceB lb = impl;
        lb.methodA();
        lb.methodB();

        System.out.println();

        InterfaceC lc = impl;
        lc.methodA();
        lc.methodB();
        lc.methodC();
    }
}
