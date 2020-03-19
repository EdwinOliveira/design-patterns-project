package transportTax;

import transport.MedicationComponent;

/**
 * NormalTaxPeriods
 */
public class NormalTaxPeriods extends Tax {

    //Constructor;
    public NormalTaxPeriods(MedicationComponent medicationComponent) {
        super(medicationComponent);
    }

    @Override
    public double applyTaxToPrice() {
        return medicationComponent.getPrice() + (0.05 * medicationComponent.getPrice());
    }   
}