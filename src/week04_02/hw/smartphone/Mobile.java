package week04_02.hw.smartphone;

public class Mobile {
    String model;
    int battery = 0;

    public void infoMobile() {
        System.out.println("모델명 : " + this.model);
        System.out.println("배터리 잔량 : " + this.battery + "%");
        System.out.println(" ");
    }

    public void useMobile(int x) {
        System.out.println("휴대폰을 사용합니다.");
        if (this.battery - x <= 0) {
            this.battery = 0;
            System.out.println("배터리 잔량이 0입니다. 충전하세요.");
        } else {
            this.battery -= x;
            System.out.println("배터리를 사용했습니다.");
            System.out.println("현재 배터리 잔량 : " + this.battery + "%");
        }
    }

    public void chargeMobile(int x) {
        System.out.println("휴대폰을 충전합니다.");
        if (this.battery + x >= 100) {
            this.battery = 100;
            System.out.println("배터리가 완전히 충전되었습니다.");
        } else {
            this.battery += x;
            System.out.println("배터리가 " + this.battery + "% 까지 충전 되었습니다.");
        }
    }

    public Mobile(String model) {
        this.model = model;
    }

    public Mobile() {
        this.model = "default company";
    }
}
