package authentication;

/**
 * Driver
 */
public class Driver {

    //fields
    private String name;
    private String password;

    //constructor
    public Driver(String name, String password) {
        this.name = name;
        this.password = password;
    }

    //methods
    public String getName() {
        return this.name;
    };

    public String getPassword() {
        return this.password;
    };
}