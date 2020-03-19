package factory;
import reutilization.ObjectPool;
import transport.composite.MedicationComposite;
import transport.leafs.Medication;

/**
 * Factory
 */
public class Factory {

    public ObjectPool getType(Double price, String label) {
        ObjectPool objectPool = ObjectPool.getObjectPool();

        if(label == null)
            return null;

        if(label.equalsIgnoreCase("Container")) {
            MedicationComposite medicationContainer = new MedicationComposite(label);
        }

        if(label.equalsIgnoreCase("Box")) {
            MedicationComposite medicationBox = new MedicationComposite(label);
        }

        if(label.equalsIgnoreCase("Package")) {
            MedicationComposite medicationPackage = new MedicationComposite(label);
        }

        if(label.equalsIgnoreCase("Pill")) {
            Medication pill = new Medication(label, price);
        }

        if(label.equalsIgnoreCase("Vaccine")) {
            Medication vaccine = new Medication(label, price);
        }

        if(label.equalsIgnoreCase("Bottle")) {
            Medication bottle = new Medication(label, price);
        }

        return null;
    }
}