package week12_01.ch13.sec03.exam01;

public class GenericExample {
    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);
    }
}
