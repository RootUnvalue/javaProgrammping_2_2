package week05_01.sec10.exam01;

public class ClassName {
    int field1;
    void method1() {}

    static int field2;
    static void method2(){}

    static {
//        field1=10;
//        method1();
        field2=10;
        method2();
    }

    static void Method3() {
        ClassName obj=new ClassName();
        obj.field1=10;
        obj.method1();
    }
}
