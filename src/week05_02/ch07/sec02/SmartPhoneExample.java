package week05_02.ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone  myPhone = new SmartPhone("Galaxy", "Silver");

        System.out.println("Model:" + myPhone.model);
        System.out.println("Color:" + myPhone.color);
        myPhone.bell();
        myPhone.sendVoice("엽세요");
        myPhone.receiveVoice("헬로 아임 홍길동");
        myPhone.hangUP();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
