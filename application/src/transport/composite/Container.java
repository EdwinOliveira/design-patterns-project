package transport.composite;

import tax.TaxInterface;

/**
 * Container
 */
public class Container extends MedicationComposite {

    public Container(String label, TaxInterface taxInterface) {
        super(label, taxInterface);
    }    
}