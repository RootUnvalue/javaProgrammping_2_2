package week07_01.hw.p5;

public interface Service {
    default void process() {
        log();
    }

    private void log() {
        System.out.println("process will start");
    }
}
