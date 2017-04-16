package bike;

/**
 * シティサイクル
 */
public class CityCycle implements Bike{

    public void ride() {
        System.out.println("シティサイクル走ります。");
    }

    public void brake() {
        System.out.println("シティサイクル止まります。");

    }

    public void changeGear(Bike.ChangingGear changingGear) {
        // can not change gear.
        System.out.println("変速機能はありません。");
    }
}
