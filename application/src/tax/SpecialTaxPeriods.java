package tax;

/**
 * SpecialTaxPeriods
 */
public class SpecialTaxPeriods implements TaxInterface {

    @Override
    public double applyTaxToValue(double price) {
        System.out.println((price * 0.1) + price);
        return (price * 0.1) + price;
    }

    
}