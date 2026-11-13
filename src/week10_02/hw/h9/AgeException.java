package week10_02.hw.h9;

public class AgeException extends Exception {
    AgeException() {
        super("18세 미만은 가입 불가");
    }
}
