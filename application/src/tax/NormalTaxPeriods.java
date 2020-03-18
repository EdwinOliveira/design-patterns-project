package tax;

/**
 * NormalTaxPeriods
 */
public class NormalTaxPeriods implements TaxInterface {

    @Override
    public double applyTaxToValue(double price) {
        // TODO Auto-generated method stub
        System.out.println((price * 0.05) + price);
        return (price * 0.05) + price;
    }

    
}