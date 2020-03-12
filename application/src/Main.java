import authentication.Authentication;

/**
 * main
 */
public class Main {

    public static void Main(String[] args) {
        
        //Authentication
        Authentication authenticationObject = Authentication.getAuthenticationInstance();

        //add new driver
        authenticationObject.createDriver("Diogo","12345");
        //check driver
        if(authenticationObject.checkDriver("Diogo","12345") == false)
            System.out.println("User not found!");

        System.out.println("User found");
        return;
    }
}