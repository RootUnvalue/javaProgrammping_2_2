package week05_02.hw.animals;

public class Cat extends Animal {
    @Override
    public void sound(String s) {
        System.out.println("고양이는 야옹");
        System.out.println(s + " 애옹");
    }
}
