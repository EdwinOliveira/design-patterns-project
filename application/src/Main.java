import authentication.Authentication;
import transport.Box;
import transport.Container;
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
        Box box = new Box();
        Pill pill = new Pill();
        Container container = new Container();
        container.addMedication(box);
        container.addMedication(pill);
        container.showMedicationTransport();
    }
}