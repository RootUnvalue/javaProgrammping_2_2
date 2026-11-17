package week12_01.ch13.sec05;

public class GenericExample {
    public static void main(String[] args) {
//        For All(Person, Student, Worker)
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        System.out.println();

//        extends Student
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        System.out.println();

//        super Worker
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
        Course.registerCourse3(new Applicant<Person>(new Person()));
    }
}
