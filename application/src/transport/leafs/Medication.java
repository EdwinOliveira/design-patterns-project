package transport.leafs;
import transport.MedicationComponent;

/**
 * Medication
 */
public class Medication extends MedicationComponent{
    //fields
    private String label;
    private double price;

    /**
     * This will instantiate the class with the label and the price;
     * @param label
     * @param price
     */
    public Medication(String label, double price) {
        this.label = label;
        this.price = price;
    }

    /**
     * This will give out the labels for a composite;
     */
    @Override
    public String getLabel() {
        super.getLabel();
        System.out.println(label);
        return label;
    }    

    @Override
    public double getPrice() {
        super.getPrice();
        return price;
    }
}