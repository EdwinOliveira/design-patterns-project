import authentication.Authentication;
import transport.Bottle;
import transport.Box;
import transport.Container;
import transport.Package;
import transport.Pill;
import transport.SpecialPeriods;

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
        //Instantiating the Transport Sets;
        Container firstContainer = new Box(new SpecialPeriods());
        Container secondContainer = new Package(new SpecialPeriods());
        Container thirdContainer = new Pill(new SpecialPeriods());
        Container forthContainer = new Bottle(new SpecialPeriods());

        //Adding some sets to anothers;
        firstContainer.addMedication(secondContainer);
        secondContainer.addMedication(thirdContainer);
        secondContainer.addMedication(forthContainer);

        //Running all levels
        firstContainer.transport();
        float price = firstContainer.price();

        float value = firstContainer.applyTaxToPrice(price);
        System.out.println(value);
    }
}