package transport.composite;

import tax.TaxInterface;

/**
 * Box
 */
public class Box extends MedicationComposite {

    public Box(String label, TaxInterface taxInterface) {
        super(label, taxInterface);
    }
        
}