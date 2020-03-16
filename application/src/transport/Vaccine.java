package transport;

/**
 * Vaccine
 */
public class Vaccine extends Container {

    //fields
    private float price;

    public Vaccine(PriceInterface priceInterface) {
        super(priceInterface);
        this.price = 30;
    }

    @Override
    public float price() {
       this.price += super.price();
       return this.price;
    }

    @Override
    public void transport() {
        System.out.println("Vaccine");
        super.transport();
    }
    @Override
    public float applyTaxToPrice(float price) {
        return priceInterface.applyTaxToPrice(price);
    }
}
