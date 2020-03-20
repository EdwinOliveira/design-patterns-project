import authentication.Authentication;
import factory.MedicationComponentFactory;
import factory.factorySubClasses.MedicationCompositeFactory;
import factory.factorySubClasses.MedicationFactory;
import transport.MedicationComponent;
import transport.composite.MedicationComposite;
import transport.leafs.Medication;
import transportTax.NormalTaxPeriods;
import transportTax.Tax;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        singleton();
        composite();

        return;
    }

    public static void singleton() {
        //Authentication
        Authentication authenticationObject = Authentication.getAuthenticationInstance();
        
        //add new driver
        authenticationObject.createDriver("Diogo", "12345");

        //check driver
        authenticationObject.checkDriver("Diogo", "12345");
    }

    public static void composite() {
        //Instantiating Factory;
        MedicationComponentFactory medicationCompositeFactory = new MedicationCompositeFactory();
        MedicationComponentFactory medicationFactory = new MedicationFactory();
        
        //Instantiating Composite;
        MedicationComponent medicationComposite = medicationCompositeFactory.storeMedicationComponent("Box");

        //Instantiating Medication;
        MedicationComponent pill = medicationFactory.storeMedicationComponent("Pill", 5.2);
        MedicationComponent vaccine = medicationFactory.storeMedicationComponent("Vaccine", 2.2);
        
        //Adding elements to box;
        ((MedicationComposite) medicationComposite).addComponent(pill);
        ((MedicationComposite) medicationComposite).addComponent(vaccine);

        //Apply NormalTax;
        Tax normalTax = new NormalTaxPeriods(medicationComposite);
        double value = normalTax.applyTaxToPrice();

        //Printing the value;
        System.out.println(value);
    }
}