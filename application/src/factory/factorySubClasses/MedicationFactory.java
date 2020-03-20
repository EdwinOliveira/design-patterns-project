package factory.factorySubClasses;

import transport.MedicationComponent;
import transport.leafs.Medication;
import factory.MedicationComponentFactory;
import reutilization.ObjectPool;

/**
 * MedicationFactory
 */
public class MedicationFactory implements MedicationComponentFactory {
    
    // Field
    private ObjectPool objectPool = ObjectPool.getObjectPool();

    @Override
    public MedicationComponent storeMedicationComponent(String label, Double price) {
        if(label.equals("Pill")) {
            MedicationComponent pill = new Medication(label, price);
            return this.objectPool.acquireConnection(pill);
        }

        if(label.equals("Vaccine")) {
            MedicationComponent vaccine = new Medication(label, price);
            return this.objectPool.acquireConnection(vaccine);
        }

        if(label.equals("Bottle")) {
            MedicationComponent bottle = new Medication(label, price);
            return this.objectPool.acquireConnection(bottle);
        }

        return null;
    }

    @Override
    public MedicationComponent storeMedicationComponent(String label) {
        return null;
    }
}