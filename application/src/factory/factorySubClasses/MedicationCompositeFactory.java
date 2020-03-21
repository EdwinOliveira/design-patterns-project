package factory.factorySubClasses;
import reutilization.ObjectPool;
import transport.MedicationComponent;
import transport.composite.MedicationComposite;
import factory.MedicationComponentFactory;

/**
 * MedicationCompositeFactory
 */
public class MedicationCompositeFactory implements MedicationComponentFactory {

    // Field
    private ObjectPool objectPool = ObjectPool.getObjectPool();

    @Override
    public MedicationComponent storeMedicationComponent(String label) {
        if(label.equals("Package")) {
            MedicationComponent medicationPackage = new MedicationComposite(label);
            return this.objectPool.acquireConnection(medicationPackage);
        }

        if(label.equals("Box")) {
            MedicationComponent medicationBox = new MedicationComposite(label);
            return this.objectPool.acquireConnection(medicationBox);
        }

        if(label.equals("Container")) {
            MedicationComponent medicationContainer = new MedicationComposite(label);
            return this.objectPool.acquireConnection(medicationContainer);
        }
        return null;
    }

    @Override
    public MedicationComponent storeMedicationComponent(String label, Double price) {
        return null;
    }

    @Override
    public void removeMedicationComponent(MedicationComponent medicationComponent) {
        // TODO Auto-generated method stub
        this.objectPool.relaseConnection(medicationComponent);
    }
    
   
}