package transportTax;

import transport.MedicationComponent;

/**
 * SpecialTaxPeriods
 */
public class SpecialTaxPeriods extends Tax {

    protected SpecialTaxPeriods(MedicationComponent medicationComponent) {
        super(medicationComponent);
    }

    @Override
    public double applyTaxToPrice() {
        return medicationComponent.getPrice() + (medicationComponent.getPrice() * 0.10);
    }
    
    
}