import authentication.Authentication;
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
        //Instantiating Objects;
        MedicationComposite box = new MedicationComposite("Box");
        Medication pill = new Medication("Pill", 5);
        Medication vaccine = new Medication("Vaccine", 2);
        
        //Adding elements to box;
        box.addChildToArrayList(pill);
        box.addChildToArrayList(vaccine);

        //Apply NormalTax;
        Tax normalTax = new NormalTaxPeriods(box);
        double value = normalTax.applyTaxToPrice();

        //Printing the value;
        System.out.println(value);
    }
}