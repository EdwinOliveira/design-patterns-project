package transport;

/**
 * Vaccine
 */
public class Vaccine extends Container {

    public Vaccine() {
        super();
    }

    @Override
    public void transport() {
        System.out.println("Vaccine");
        super.transport();
    }
}
