package week11_01.ch13.sec02.exam03;

public class Box<T> {
    public T content;

    public boolean equals(Box<T> other) {
        return content.equals(other.content);
    }

    public boolean compare(Box<T> other) {
        return content == other.content;
    }
}
