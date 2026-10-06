package week05_02.hw.company;

public class Developer extends Employee {
    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public int getSalary() {
        //10 = 식비
        return super.getSalary() - 10;
    }
}
