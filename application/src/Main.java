import authentication.Authentication;
import tax.NormalTaxPeriods;
import tax.SpecialTaxPeriods;
import transport.composite.MedicationComposite;
import transport.leafs.Medication;

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
        //Instantiating Objects;
        MedicationComposite box = new MedicationComposite("Box", new NormalTaxPeriods());
        Medication pill = new Medication("Pill", 5, new NormalTaxPeriods());
        Medication vaccine = new Medication("Vaccine", 2, new SpecialTaxPeriods());
        
        //Adding elements to box
        box.addChildToArrayList(pill);
        box.addChildToArrayList(vaccine);
        
        //Do methods
        box.getLabel();
        box.applyTax();
    }
}