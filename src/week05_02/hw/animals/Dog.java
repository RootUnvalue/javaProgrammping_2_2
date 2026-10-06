package week05_02.hw.animals;

public class Dog extends Animal {
    @Override
    public void eat(String food) {
        super.eat(food);
    }

    @Override
    public void sound(String s) {
        System.out.println("개는 " + s + " 짖어요");
        super.sound(s);
    }
}
