package transport;

/**
 * Package
 */
public class Package implements Medication {
    public Package() {}

    @Override
    public void transport() {
        System.out.println("This medication comes from a Package");
    };
}