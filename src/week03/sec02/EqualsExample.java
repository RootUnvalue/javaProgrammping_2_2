package week03.sec02;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";
        if(strVar1 == strVar2){
            System.out.println("strVar1 == strVar2");
        } else {
            System.out.println("strVar1 != strVar2");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("strVar1.equals(strVar2) == true");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if(strVar3 == strVar4){
            System.out.println("strVar3 == strVar4");
        } else {
            System.out.println("strVar3 != strVar4");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("strVar3.equals(strVar4) == true");
        }
    }
}
