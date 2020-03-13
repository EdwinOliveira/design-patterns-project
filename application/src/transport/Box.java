package transport;

/**
 * Box
 */
public class Box implements Medication {

    public Box() {}

    @Override
    public void transport() {
        System.out.println("This medication comes from a Box!");
    };
}