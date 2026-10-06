package week05_02.hw.company;

public class Manager extends Employee {
    Manager(String name, int age) {
        super(name, age);
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Pay: " + this.salary);
    }

    @Override
    public int getSalary() {
        return super.getSalary() - (int) (super.getSalary() * 0.02);
    }

    @Override
    public void work(int t) {
        super.work(t);
        System.out.println("휴계시간을 포함한 " + t + "시간동안 일하다.");
    }
}
