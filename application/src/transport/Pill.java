package transport;

/**
 * Pill
 */
public class Pill extends Container {

    //fields
    private float price;

    public Pill(PriceInterface priceInterface) {
        super(priceInterface);
        this.price = 25;
    };

    @Override
    public float price() {
        this.price += super.price();
        return this.price;
    }

    @Override
    public void transport() {
        // TODO Auto-generated method stub
        System.out.println("Pill");
        super.transport();
    }    
    @Override
    public float applyTaxToPrice(float price) {
        return priceInterface.applyTaxToPrice(price);
    }
}