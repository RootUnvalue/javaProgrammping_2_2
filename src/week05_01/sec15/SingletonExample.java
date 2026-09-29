package week05_01.sec15;

public class SingletonExample {
    public static void main(String[] args) {
//        Singleton s1 = new Singleton();

            Singleton s1 = Singleton.getInstance();
            Singleton s2 = Singleton.getInstance();

            if(s1 == s2) {
                System.out.println("같은 obj");
            } else {
                System.out.println("다르 ojj");
            }
    }
}
