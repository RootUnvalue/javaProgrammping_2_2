package week10_02.ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
    static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수 : " + result);
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        } finally {
            System.out.println("마무리 실행");
        }
    }

    public static void main(String[] args) {
        System.out.println("start point");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("end point");
    }
}
