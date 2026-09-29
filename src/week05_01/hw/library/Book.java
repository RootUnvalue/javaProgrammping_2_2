package week05_01.hw.library;

public class Book {
    static int BOOK_ID_INDEX = 1;
    static final int MAX_LOAN_DAYS = 14;
    final int BOOK_ID;
    String title;
    String author;

    void info() {
        System.out.println("---".repeat(4));
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Book ID: " + this.BOOK_ID);
        System.out.println("대출기한: " + MAX_LOAN_DAYS);
        System.out.println("---".repeat(4));
    }

    Book(String t, String a){
        this.title = t;
        this.author = a;
        this.BOOK_ID = BOOK_ID_INDEX++;
    }
}
