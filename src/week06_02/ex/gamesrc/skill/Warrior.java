package week06_02.ex.gamesrc.skill;

import week06_02.ex.gamesrc.game.Hero;

public class Warrior extends Hero { // 다른 패키지 + 상속
    void rest() {
        heal(20); // 물려받은 메소드
        System.out.println("전사 휴식 후 hp " + hp);
    }

    public static void main(String[] args) {
        new Warrior().rest();
    }
}
