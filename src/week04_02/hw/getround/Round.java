package week04_02.hw.getround;

public class Round {
    double getRound(double a, double b) {
        double c = Math.sqrt(a*a + b*b);
        return (a + b + c);
    }

    double getRound(double a) {
        return 3*a;
    }
}
