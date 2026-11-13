package week10_02.hw.h9;

public class AgeCheck {
    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (AgeException e) {
            System.out.println("AgeException : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }

    static void checkAge(int age) throws AgeException {
        if (age < 18) throw new AgeException();
        System.out.println("나이 제한을 통과 하였습니다.");
    }
}
