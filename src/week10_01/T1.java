package week10_01;


public class T1 {
    public static void main(String[] args) {
        for(int i =  1; i < 11; i++) {
            print(i);
        }

        for(int i = 11; i < 21; i++) {
            print(i);
        }

        for(int i = 21; i < 31; i++) {
            print(i);
        }
    }

    public static void print(int i ) {
        System.out.println(i + "을(를) 출력햡니다");
    }
}
