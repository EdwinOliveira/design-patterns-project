package factory;
import transport.MedicationComponent;

/**
 * MedicationComponentFactory
 */
public interface MedicationComponentFactory {
    MedicationComponent storeMedicationComponent(String label, Double price);    
    MedicationComponent storeMedicationComponent(String label);    
}