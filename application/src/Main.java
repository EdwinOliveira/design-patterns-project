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
        //Creating a Container
        Container container = new Container();

        //Creating Leafs(Sets of Transport)
        Box box = new Box();
        Pill pill = new Pill();

        //Adding Sets of transport to the Container;
        container.addMedication(box);
        container.addMedication(pill);

        //Creating a Container
        Container container2 = new Container();
        container2.addMedication(container);

        //Showing all the Sets of Transport already created
        container.showMedicationTransport();

        //Showing all the Sets of Transport already created
        container2.showMedicationTransport();
    }
}