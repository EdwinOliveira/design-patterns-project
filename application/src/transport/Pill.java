package transport;

/**
 * Pill
 */
public class Pill implements Medication {
    public Pill() {}

    @Override
    public void transport() {
        System.out.println("This medication comes from a Pill!");
    };
}