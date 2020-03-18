package transport;

import tax.TaxInterface;

/**
 * MedicationComponent
 */
public abstract class MedicationComponent {

    //fields
    protected TaxInterface taxInterface;

    //constructor
    public MedicationComponent(TaxInterface taxInterface) {
        this.taxInterface = taxInterface;
    }

    //methods
    public void getLabel() {};

    public double getPrice() {
        return 0;
    };

    abstract public void applyTax();

}