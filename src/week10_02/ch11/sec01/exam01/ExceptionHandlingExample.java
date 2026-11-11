package week10_02.ch11.sec01.exam01;

public class ExceptionHandlingExample {
    static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수 : " + result);
    }
    public static void main(String[] args) {
        System.out.println("start point");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("end point");
    }
}
