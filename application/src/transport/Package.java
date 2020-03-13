package transport;

/**
 * Package
 */
public class Package extends Container {

    public Package() {
        super();
    }

    @Override
    public void transport() {
        System.out.println("Package");
        super.transport();
    }
        
}