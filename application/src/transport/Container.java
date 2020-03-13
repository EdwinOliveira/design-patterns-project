package transport;

import java.util.ArrayList;

/**
 * Container
 */
public abstract class Container implements Medication {

    //medicationArrayList
    private ArrayList<Medication> medicationArrayList = new ArrayList<Medication>();

    public Container() {};

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
    public void transport() {
        for(Medication medication: medicationArrayList) {
            medication.transport();
        }
    }
}