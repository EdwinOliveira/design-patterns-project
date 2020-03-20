package transport.composite;
import java.util.ArrayList;
import transport.MedicationComponent;

/**
 * MedicationComposite
 */
public class MedicationComposite extends MedicationComponent {
    //MedicationComponent ArrayList
    private ArrayList<MedicationComponent> medicationComponentArrayList = new ArrayList<MedicationComponent>();

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
    public void addChildToArrayList(MedicationComponent medicationComponent) {
        if(this.medicationComponentArrayList.contains(medicationComponent) == true)
            return;
        
        this.medicationComponentArrayList.add(medicationComponent);
    }

    /**
     * This function will remove Medications or MedicationComposites from the ArrayList;
     * @param medicationComponent
     */
    public void removeChildFromArraylist(MedicationComponent medicationComponent) {
        if(this.medicationComponentArrayList.contains(medicationComponent) == false)
            return;
        
        this.medicationComponentArrayList.remove(medicationComponent);
    }

    //This will give out the labels for a composite;
    @Override
    public String getLabel() {
        super.getLabel();
        System.out.println(this.label);
        for(MedicationComponent medicationComponent: this.medicationComponentArrayList) {
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
        for(MedicationComponent medicationComponent: this.medicationComponentArrayList) {
            this.price += medicationComponent.getPrice();
        }
        return this.price;
    }
}