package transport.leafs;

import tax.TaxInterface;
import transport.MedicationComponent;

/**
 * Medication
 */
public class Medication extends MedicationComponent{
    //fields
    private String label;
    private double price;

    /**
     * This will instantiate the class with the label and the price;
     * @param label
     * @param price
     */
    public Medication(String label, double price, TaxInterface taxInterface) {
        super(taxInterface);
        this.label = label;
        this.price = price;
    }

    /**
     * This will give out the labels for a composite;
     */
    @Override
    public void getLabel() {
        super.getLabel();
        System.out.println(label);
    }    

    @Override
    public double getPrice() {
        super.getPrice();
        return price;
    }

    @Override
    public void applyTax() {
        double value = this.getPrice();
        taxInterface.applyTaxToValue(value);
    }
}