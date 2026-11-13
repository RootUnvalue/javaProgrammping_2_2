package week10_02.ch11.sec05;

public class ThrowsExample2 {
    public static void main(String[] args) throws Exception{
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외 처리 : " + e.toString());
        }

    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
