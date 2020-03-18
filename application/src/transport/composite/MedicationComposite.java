package transport.composite;

import java.util.ArrayList;

import tax.TaxInterface;
import transport.MedicationComponent;

/**
 * MedicationComposite
 */
public abstract class MedicationComposite extends MedicationComponent {
    //MedicationComponent ArrayList
    private ArrayList<MedicationComponent> medicationComponentArrayList = new ArrayList<MedicationComponent>();

    //fields
    private double price;
    private String label;

    public MedicationComposite(String label, TaxInterface taxInterface) {
        super(taxInterface);
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
    public void getLabel() {
        super.getLabel();
        System.out.println(this.label);
        for(MedicationComponent medicationComponent: this.medicationComponentArrayList) {
            medicationComponent.getLabel();
        }
    }

    /**
     * This will give out the price for a composite;
     */
    @Override
    public double getPrice() {
        super.getPrice();
        for(MedicationComponent medicationComponent: this.medicationComponentArrayList) {
            price += medicationComponent.getPrice();
        }
        return price;
    }

    /**
     * Will call the applyTax from the Interface, this will calculate the Tax for the Row;
     */
	@Override
	public void applyTax() {
        // TODO Auto-generated method stub
        double value = this.getPrice();
        taxInterface.applyTaxToValue(value);
	}

}