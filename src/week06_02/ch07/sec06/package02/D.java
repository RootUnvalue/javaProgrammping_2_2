package week06_02.ch07.sec06.package02;

import week06_02.ch07.sec06.package01.*;

public class D extends A {

    // 생성자 선언
    public D () {
        // A() 생성자 호출
        super(); //o
    }

    // 메소드 선언
    public void method1() {
        // A 필드 값 변경
        this.field = "STRING"; // o
        // A 메소드 호출
        this.method(); // o
    }

    // 메소드 선언
    public void method2() {
//        A a = new A(); // x
//        a.field = "STRING"; // x
//        a.method(); // x
    }
}
