import authentication.Authentication;
import transport.Bottle;
import transport.Box;
import transport.Container;
import transport.Package;
import transport.Pill;

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
        Container firstContainer = new Box();
        Container secondContainer = new Package();
        Container thirdContainer = new Pill();
        Container forthContainer = new Bottle();

        //Adding some sets to anothers;
        firstContainer.addMedication(secondContainer);
        secondContainer.addMedication(thirdContainer);
        secondContainer.addMedication(forthContainer);

        //Running all levels
        firstContainer.transport();
    }
}