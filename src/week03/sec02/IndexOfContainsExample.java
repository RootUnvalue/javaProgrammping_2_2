package week03.sec02;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "Java Programming";
        int location = subject.indexOf("Programming");
        System.out.println(location);
        String subString = subject.substring(location);
        System.out.println(subString);

        location = subject.indexOf("Java");
        if(location != -1){
            System.out.println("자바와 관련된 책");
        } else {
            System.out.println("자바와 관련 없는 책");
        }
    }
}
