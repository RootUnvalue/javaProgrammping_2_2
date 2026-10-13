package week06_02.ex.gamesrc.game;

public class Potion {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.heal(30); // 같은 패키지 → 가능
        hero.hp = 100; // 같은 패키지 → 가능
        System.out.println("최대 체력으로: " + hero.hp);

        minus(hero);
    }


    public static void minus(Hero hero) {
        System.out.println("현재 체력 : " + hero.hp);
        hero.heal(-20);
        System.out.println("변경된 체력 : " + hero.hp);
    }
    // hero.heal(-20) 호출시 hero.hp -= 20
}
