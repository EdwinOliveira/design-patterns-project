package transportTax;

import transport.MedicationComponent;

/**
 * Tax
 */
public abstract class Tax {
    //Medication Component Reference;
    protected MedicationComponent medicationComponent;

    //Constructor;
    protected Tax(MedicationComponent medicationComponent) {
        this.medicationComponent = medicationComponent;
    }

    public abstract double applyTaxToPrice();
}