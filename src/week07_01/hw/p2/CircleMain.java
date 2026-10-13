package week07_01.hw.p2;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("PI = " + circle.PI);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();
        double area = circle.calculateArea(radius);
        System.out.println("The area of the circle is " + area);
        sc.close();
    }
}
