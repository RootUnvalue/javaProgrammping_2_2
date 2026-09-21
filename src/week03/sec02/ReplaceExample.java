package week03.sec02;

public class ReplaceExample {
    public static void main(String[] args) {
        String oldStr = "Java String doesn't change. Type is String";
        String newStr = oldStr.replace("Java", "JAVA");
        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
