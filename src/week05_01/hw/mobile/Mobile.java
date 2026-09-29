package week05_01.hw.mobile;

public class Mobile {
    static final int MAX_VOL = 100;
    static String BRAND = "GALAXY";
    String model;
    int price;

    void info() {
        System.out.println("---".repeat(4));
        System.out.println("Brand: " + BRAND);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("------END------");
    }

    Mobile(String m, int p) {
        this.model = m;
        this.price = p;
    }
}
