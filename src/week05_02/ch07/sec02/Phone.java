package week05_02.ch07.sec02;

public class Phone {
    public String model;
    public String color;

    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message) {
        System.out.println("Me: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("Sender: " + message);
    }

    public void hangUP() {
        System.out.println("전화를 끊습니다.");
    }
}
