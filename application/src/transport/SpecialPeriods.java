package transport;

/**
 * SpecialPeriods
 */
public class SpecialPeriods implements PriceInterface {
    @Override
    public float applyTaxToPrice(float price) {
        return (float) (0.1 * price) + price;
    }    
}