package week05_02.hw.mobile;

public class PhoneMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("GALAXY", "GOLD");
        smartPhone.internet();
        smartPhone.bell();
        smartPhone.call();
    }
}
