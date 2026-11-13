package week10_02.hw.h4;

public class ExceptionHandler {
    public static void main(String[] args) {
        String name = null;

        try {
            System.out.println("이름 정보를 확인합니다.");
            System.out.println("이름의 길이: " + name.length());
        } catch (NullPointerException e) {
            System.out.println("이름 정보가 존재하지 않습니다.");
        } catch (Exception e) {
            System.out.println("발생한 예외 정보 : " + e.getMessage());
        } finally {
            System.out.println("프로그램을 계속 실행합니다.");
        }
    }
}
