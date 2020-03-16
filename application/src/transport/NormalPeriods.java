package transport;

/**
 * NormalPeriods
 */
public class NormalPeriods implements PriceInterface {
    @Override
    public float applyTaxToPrice(float price) {
        return (float) (0.05 * price) + price;
    }    
}