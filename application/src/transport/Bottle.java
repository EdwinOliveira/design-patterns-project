package transport;

/**
 * Bottle
 */
public class Bottle implements Medication{
    public Bottle() {};

    @Override
    public void transport() {
        System.out.println("This medication comes from a Bottle!");
    };
}