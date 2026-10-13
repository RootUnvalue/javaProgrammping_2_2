package week07_01.ch08.sec07;

public interface Service {

    // default method
    default void defaultMethod1() {
        System.out.println("defaultMethod1 defends code");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("defaultMethod2 defends code");
        defaultCommon();
    }

    // private method
    private void defaultCommon() {
        System.out.println("defaultMethod same code A");
        System.out.println("defaultMethod same code B");
    }

    // static method
    static void staticMethod1() {
        System.out.println("staticMethod1 defends code");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("staticMethod2 defends code");
        staticCommon();
    }

    // private static method
    private static void staticCommon() {
        System.out.println("staticMethod same code C");
        System.out.println("staticMethod same code D");
    }
}
