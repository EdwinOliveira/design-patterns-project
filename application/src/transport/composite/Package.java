package transport.composite;

import tax.TaxInterface;

/**
 * Package
 */
public class Package extends MedicationComposite {

    public Package(String label, TaxInterface taxInterface) {
        super(label, taxInterface);
    }    
}