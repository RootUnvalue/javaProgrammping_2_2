package week05_02.hw.company;

public class Manager extends Employee {
    Manager(String name, int age) {
        super(name, age);
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Pay: " + this.pay);
    }
}
