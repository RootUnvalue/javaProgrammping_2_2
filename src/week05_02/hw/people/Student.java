package week05_02.hw.people;

public class Student extends Person {
    Student (String n, int a) {
        super(n, a);
        System.out.println("Name:" + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Student(String n, int a) 호출");
    }

    Student (String n) {
        super(n);
        System.out.println("Name:" + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Student(String n) 호출");
    }

     public void showMe() {
         System.out.println("Ma nem is " + this.name + ", " + this.age + "year old, im student going INJE high school.");
     }
}
