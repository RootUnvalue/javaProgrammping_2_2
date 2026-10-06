package week05_02.hw.company;

public class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int  getSalary() {
        return salary;
    }

    public void work(int t) {
        System.out.println(t + "시간 동안 일하다.");
    }
}
