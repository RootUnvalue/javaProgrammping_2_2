package week03.sec02;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "950624-1230123";
        char sex = ssn.charAt(7);
        switch (sex) {
            case '1', '3':
                System.out.println("Male");
                break;
            case '2', '4':
                System.out.println("Female");
                break;
        }
    }
}
