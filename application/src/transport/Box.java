package transport;

/**
 * Box
 */
public class Box extends Container {

    //fields
    private float price = 0;

    public Box(PriceInterface priceInterface) {
        super(priceInterface);
    }

    @Override
    public float price() {
        this.price += super.price();
        return this.price;
    }

    @Override
    public void transport() {
        System.out.println("Box");
        super.transport();
    }
    
    @Override
    public float applyTaxToPrice(float price) {
        return priceInterface.applyTaxToPrice(price);
    }

}