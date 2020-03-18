package factory;

import tax.TaxInterface;
import transport.composite.MedicationComposite;

/**
 * Factory
 */
public class Factory {

    public MedicationComposite getType(String type, String label, TaxInterface taxInterface) {
        if(type == null)
            return null;

        if(type.equalsIgnoreCase("New")) {
            return new MedicationComposite(label, taxInterface);
        }

        if(type.equalsIgnoreCase("Reutilization")) {
            return new MedicationComposite(label, taxInterface);
        }

        return null;
    }
}