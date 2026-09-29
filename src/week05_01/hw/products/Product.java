package week05_01.hw.products;

public class Product {
    static final double TAX_RATE = 0.05;
    String name;
    int price;


    void calculatePrice() {
        System.out.println("'" + this.name + "'의 개당 가격(세금포함) : $" + (this.price + (this.price * TAX_RATE)));
    }

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
