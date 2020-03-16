package transport;

/**
 * Package
 */
public class Package extends Container {

    //fields
    private float price = 0;

    public Package(PriceInterface priceInterface) {
        super(priceInterface);
    }

    @Override
    public float price() {
        this.price = super.price();
        return this.price;
    }

    @Override
    public void transport() {
        System.out.println("Package");
        super.transport();
    }


    @Override
    public float applyTaxToPrice(float price) {
        return priceInterface.applyTaxToPrice(price);
    }
        
}