package week05_02.hw.people;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person(String name, int age) 호출");
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
        System.out.println("Person(String name) 호출");
    }

    public final void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("출력끝.");
    }
}
