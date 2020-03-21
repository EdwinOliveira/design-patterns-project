package transport.composite;
import java.util.ArrayList;
import transport.MedicationComponent;

/**
 * MedicationComposite
 */
public class MedicationComposite extends MedicationComponent {
    //MedicationComponent ArrayList
    private ArrayList<MedicationComponent> componentList = new ArrayList<MedicationComponent>();

    //fields
    private double price;
    private String label;

    public MedicationComposite(String label) {
        this.label = label;
    }

    /**
     * This function will add new Medications or MedicationsComposites to the ArrayList;
     * @param medicationComponent
     */
    public void addComponent(MedicationComponent medicationComponent) {
        if(this.componentList.contains(medicationComponent) == true)
            return;
        
        this.componentList.add(medicationComponent);
    }

    /**
     * This function will remove Medications or MedicationComposites from the ArrayList;
     * @param medicationComponent
     */
    public void removeComponent(MedicationComponent medicationComponent) {
        if(this.componentList.contains(medicationComponent) == false)
            return;
        
        this.componentList.remove(medicationComponent);
    }

    //This will give out the labels for a composite;
    @Override
    public String getLabel() {
        super.getLabel();
        for(MedicationComponent medicationComponent: this.componentList) {
            medicationComponent.getLabel();
        }
        return label;
    }

    /**
     * This will give out the price for a composite;
     */
    @Override
    public double getPrice() {
        super.getPrice();
        for(MedicationComponent medicationComponent: this.componentList) {
            this.price += medicationComponent.getPrice();
        }
        return this.price;
    }
}