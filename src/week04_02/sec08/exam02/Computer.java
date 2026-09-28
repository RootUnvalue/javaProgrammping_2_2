package week04_02.sec08.exam02;

import java.util.stream.IntStream;

public class Computer {
    int sum(int ... values) {
        return IntStream.of(values).sum();
//        return IntStream.rangeClosed(0, values.length - 1).map(i -> values[i]).sum();
    }
}
