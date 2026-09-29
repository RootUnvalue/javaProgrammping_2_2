package week05_01.hw.library;

public class LibraryBook {
    public static void main(String[] args) {
        Book b1 = new Book("자바 고수가 되는 법!", "JAVA KIM");
        Book b2 = new Book("프리드버그 선형대수학 10th Edition", "프리드버그 등");

        b1.info();
        b2.info();
    }
}
