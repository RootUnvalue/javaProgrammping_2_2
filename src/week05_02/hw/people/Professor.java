package week05_02.hw.people;

public class Professor extends Person{

    Professor(String n, int a){
        super(n, a);
    }

    public void showMe() {
        System.out.println("ma major is Computer Engineering.");
        super.printInfo();
    }
}
