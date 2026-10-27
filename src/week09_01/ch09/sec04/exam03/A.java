package week09_01.ch09.sec04.exam03;

public class A {
    public void method1(int arg) {
        int var = 1;

        class B {
            void method2() {
                System.out.println("arg: " + arg);
                System.out.println("var: " + var);
//                arg = 2; //(x)
//                var = 2; //(x)
            }
        }
        B b = new B();
        b.method2();

//         cant
//        arg = 3;
//        var = 3;
    }
}
