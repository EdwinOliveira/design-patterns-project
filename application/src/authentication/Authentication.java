package authentication;

import java.util.HashMap;

/**
 * Authentication
 */
public class Authentication {

    //Authentication Instance;
    private Authentication authenticationInstance = null;

    //Driver Hashmap;
    private HashMap<Integer, Driver> driversHash = new HashMap<Integer, Driver>();

    private Authentication() {
        
    }

    /** 
     * This function will return the UNIQUE instance to ever be created on this project (UNIQUE/GLOBAL)
     * @return Authentication Class Instance
     */
    public Authentication getAuthenticationInstance() {
        if(this.authenticationInstance == null)
            this.authenticationInstance = new Authentication();

        return this.authenticationInstance;
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
     * @return
     */
    public Boolean checkDriver(String name, String password) {
        for(Driver driver : this.driversHash.values()) {
            if((driver.getName() == name) && (driver.getPassword() == password))
                return true;
        }
        return false;
    }
}