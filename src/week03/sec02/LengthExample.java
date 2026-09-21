package week03.sec02;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        int length = ssn.length();
        if(length == 13) {
            System.out.println("length of ssn == 13");
        } else {
            System.out.println("length of ssn != 13");
        }
    }
}
