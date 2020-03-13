package transport;

import java.util.ArrayList;

/**
 * Container
 */
public class Container implements Medication {

    //fields
    private ArrayList<Medication> medications;

    //Constructor
    public Container() {
        this.medications = new ArrayList<Medication>();
    }

    //Methods

    @Override
    public void transport() {
        // TODO Auto-generated method stub
        System.out.println("This Medication comes from a Container");
    };    

    public void showMedicationTransport() {
        for(Medication medication: medications) {
            medication.transport();
        }
    }

    public void addMedication(Medication Medication) {
        if(this.medications.contains(Medication) == true)
            return;

        this.medications.add(Medication);

    }

    public void removeContainer(Medication Medication) {
        if(this.medications.contains(Medication) == false)
            return;

        this.medications.remove(Medication);
    }
}