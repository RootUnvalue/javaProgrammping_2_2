package week09_01.ch09.sec05.exam01;

public class A_b {
    int field1;

    void method1(){
        System.out.println("A_b method1() 실행");
    }

    static int field2;

    static void method2() {
        System.out.println("A_b method2() 실행");
    }

    class B {
        void method() {
            field1 = 10;
            method1();

            field2 = 20;
            method2();

            System.out.println("B field1: " + field1);
            System.out.println("B field2: " + field2);
        }
    }

    static class C {
        void method() {
            // cant use
//            field1 = 10;
//            method1();
            field2 = 20;
            method2();

            System.out.println("C field1: " + field2);
        }
    }
}
