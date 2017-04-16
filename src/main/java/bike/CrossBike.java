package bike;

/**
 * クロスバイク
 */
public class CrossBike implements Bike{

    private int gear;

    private static final int gearLimit = 8;

    public CrossBike() {
        this.gear = 4;
    }

    public void ride() {
        System.out.println("クロスバイク走ります");
    }

    public void brake() {
        System.out.println("クロスバイク止まります");
    }

    public void changeGear(Bike.ChangingGear changingGear) {
        switch (changingGear) {
            case UP:
                if ((gear + 1) >= gearLimit) {
                    System.out.println("ギヤは最大です");
                    return;
                }
                System.out.println("ギヤを上げます");
                this.gear += 1;
                break;
            case DOWN:
                if (gear -1 <= 0) {
                    System.out.println("ギヤは最小です");
                    return;
                }
                System.out.println("ギヤを下げます");
                this.gear -= 1;
                break;
        }
    }
}
