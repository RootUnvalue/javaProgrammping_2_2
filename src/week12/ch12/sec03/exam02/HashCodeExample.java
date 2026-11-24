package week12.ch12.sec03.exam02;

public class HashCodeExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        if(s1.hashCode() == s2.hashCode()) {
            if(s1.getNo() == s2.getNo()) {
                System.out.println("s1 == s2");
            } else {
                System.out.println("s1 != s2");
            }
        } else {
            System.out.println("H(s1) != H(s2)");
        }
    }
}
