package week05_02.hw.people;

public class Student extends Person {
    Student (String n, int a) {
        super(n, a);
        System.out.println("Name:" + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Student() 호출");
    }
}
