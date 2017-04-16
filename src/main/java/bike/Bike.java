package bike;

/**
 * 自転車
 */
public interface Bike {

    void ride();
    void brake();
    void changeGear(ChangingGear gear);

    enum ChangingGear {
        UP,
        DOWN
    }
}
