package transport;

/**
 * Bottle
 */
public class Bottle extends Container {

    //fields
    private float price;

    public Bottle(PriceInterface priceInterface) {
        super(priceInterface);
        this.price = 50;
    };

    @Override
    public float price() {
        this.price += super.price();
        return this.price;
    }

    @Override
    public void transport() {
        // TODO Auto-generated method stub
        System.out.println("Bottle");
        super.transport();
    }

    @Override
    public float applyTaxToPrice(float price) {
        return priceInterface.applyTaxToPrice(price);
    }
}