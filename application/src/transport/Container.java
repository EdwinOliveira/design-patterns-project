package transport;

import java.util.ArrayList;

/**
 * Container
 */
public abstract class Container implements Medication {

    //fields
    private float price = 0;

    //PriceInterface
    protected PriceInterface priceInterface;

    //medicationArrayList
    private ArrayList<Medication> medicationArrayList = new ArrayList<Medication>();

    public Container(PriceInterface priceInterface) {
        this.priceInterface = priceInterface;
    };

    public void addMedication(Medication medication) {
        if(medicationArrayList.contains(medication) == true)
            return;
        
        medicationArrayList.add(medication);
    }

    public void removeMedication(Medication medication) {
        if(medicationArrayList.contains(medication) == false)
            return;
    
        medicationArrayList.remove(medication);
    }

    @Override
    public float price() {
        for(Medication medication: medicationArrayList) {
            this.price += medication.price();
        }

        return this.price;
    }   

    @Override
    public void transport() {
        for(Medication medication: medicationArrayList) {
            medication.transport();
        }
    }

    public abstract float applyTaxToPrice(float price);
}