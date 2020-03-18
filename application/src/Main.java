import authentication.Authentication;
import tax.NormalTaxPeriods;
import tax.SpecialTaxPeriods;
import transport.composite.Box;
import transport.composite.MedicationComposite;
import transport.leafs.Pill;
import transport.leafs.Vaccine;
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
        authenticationObject.createDriver("Diogo","12345");
        //check correct driver
        authenticationObject.checkDriver("Diogo","12345");
        //check incorrect driver
        authenticationObject.checkDriver("Diogo", "123456");
    }

    public static void composite() {
        //Instantiating Objects;
        MedicationComposite container = new Box("Container", new NormalTaxPeriods());
        Pill pill = new Pill("Pill", 5, new NormalTaxPeriods());
        Vaccine vaccine = new Vaccine("Vaccine", 2, new SpecialTaxPeriods());

        //Adding elements to Container
        container.addChildToArrayList(pill);
        container.addChildToArrayList(vaccine);
        
        //Do methods
        container.getLabel();
        container.applyTax();
    }
}