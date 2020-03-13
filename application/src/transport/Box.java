package transport;

/**
 * Box
 */
public class Box extends Container implements Medication {

    public Box() {
        super();
    }

    @Override
    public void transport() {
        System.out.println("Box");
        super.transport();
    }
    
}