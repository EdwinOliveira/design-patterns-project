package authentication;

import java.util.HashMap;

/**
 * Authentication
 */
public class Authentication {

    //Authentication Instance;
    private static Authentication authenticationInstance = null;

    //Driver Hashmap;
    private HashMap<Integer, Driver> driversHash = new HashMap<Integer, Driver>();

    private Authentication() {
        
    }

    /** 
     * This function will return the UNIQUE instance to ever be created on this project (UNIQUE/GLOBAL)
     * @return Authentication Class Instance
     */
    public static Authentication getAuthenticationInstance() {
        if(authenticationInstance == null)
            authenticationInstance = new Authentication();

        return authenticationInstance;
    }

    /**
     * This function will create a new Driver so it can be authenticated
     * @param name
     * @param password
     */
    public void createDriver(String name, String password) {
        Driver driver = new Driver(name, password);
        
        this.driversHash.put((this.driversHash.size() + 1), driver);  
    }

    /**
     * This function will verify if the given argumments are stored on the Driver class
     * @param name
     * @param password
     * @return if user valid then true, no user false
     */
    public void checkDriver(String name, String password) {
        for(Driver driver : this.driversHash.values()) {
            if((driver.getName().equals(name)) && (driver.getPassword().equals(password))) {
                System.out.println("User was found!");
            } else {
                System.out.println("User was not found!");
            }
        }
    }
}