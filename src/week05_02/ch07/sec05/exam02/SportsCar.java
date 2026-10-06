package week05_02.ch07.sec05.exam02;

public class SportsCar extends Car{
    @Override
    public void speedUp() {
        speed += 10;
    }

//    cant override final method.
/*
    @Override
    public void stop() {
    System.out.println("스포츠카를 멈춤");
    speed = 0;
}
*/
}
