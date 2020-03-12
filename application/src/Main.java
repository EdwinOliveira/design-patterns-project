import authentication.Authentication;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        
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