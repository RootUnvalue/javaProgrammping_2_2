package week05_01.hw.products;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("감자", 4);
        Product p2 = new Product("고구마", 6);
        Product p3 = new Product("배추", 10);
        p1.calculatePrice();
        p2.calculatePrice();
        p3.calculatePrice();
    }
}
