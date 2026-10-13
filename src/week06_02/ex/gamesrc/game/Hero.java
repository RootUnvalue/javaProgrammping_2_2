package week06_02.ex.gamesrc.game;

public class Hero {
    protected int hp = 50;
    protected void heal(int amount) {
        hp += amount;
        System.out.println("체력: " + hp);
    }
}