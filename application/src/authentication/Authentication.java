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

    public Authentication getAuthenticationInstance() {
        if(this.authenticationInstance == null)
            this.authenticationInstance = new Authentication();

        return this.authenticationInstance;
    }

    public void createDriver(String name, String password) {
        Driver driver = new Driver(name, password);
        
        this.driversHash.put((this.driversHash.size() + 1), driver);  
    }

    public Boolean checkDriver(String name, String password) {
        for(Driver driver : this.driversHash.values()) {
            if((driver.getName() == name) && (driver.getPassword() == password))
                return true;
        }
        return false;
    }
}