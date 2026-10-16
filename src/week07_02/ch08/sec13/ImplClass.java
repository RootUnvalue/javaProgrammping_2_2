package week07_02.ch08.sec13;

public class ImplClass implements InterfaceC {
    @Override
    public void methodC() {
        System.out.println("methodC()");
    }

    @Override
    public void methodB() {
        System.out.println("methodB()");
    }

    @Override
    public void methodA() {
        System.out.println("methodA()");
    }
}
