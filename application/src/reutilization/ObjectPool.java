package reutilization;

import java.util.ArrayList;

import transport.MedicationComponent;

/**
 * ObjectPool
 */
public class ObjectPool {

    //ObjectPool Instance
    private static ObjectPool objectPoolInstance = null;

    //Lock/Unlock MedicationComponents ArrayList;
    private ArrayList<MedicationComponent> lockMedicationComponents, unlockMedicationComponents; 

    //Fields
    int size;

    //Constructor;
    private ObjectPool() {
        //Create new Arraylists;
        this.lockMedicationComponents = new ArrayList<MedicationComponent>();
        this.unlockMedicationComponents = new ArrayList<MedicationComponent>();

        //Size of the ArrayLists;
        this.size = 10;
    }

    //Getting ObjectPool instance;
    public static ObjectPool getObjectPool() {
        if(objectPoolInstance == null)
            objectPoolInstance = new ObjectPool();

        return objectPoolInstance;
    }
    
    //Acquire a new slot to connect;
    public synchronized MedicationComponent acquireConnection(MedicationComponent medicationComponent) {
        if(this.lockMedicationComponents.size() >= size)
            return null;

        if(this.unlockMedicationComponents.isEmpty() == true){ 
            this.lockMedicationComponents.add(medicationComponent);         
            //Index of object;
            int medicationComponentIndex = this.lockMedicationComponents.indexOf(medicationComponent);

            return this.lockMedicationComponents.get(medicationComponentIndex);
        } else {
            if(medicationComponent.getLabel().equalsIgnoreCase("Container") || medicationComponent.getLabel().equalsIgnoreCase("Box")) {
                //Reusing Object;
                MedicationComponent medicationComponentTemp;
    
                //Getting and removing from the unlocked ArrayList;
                medicationComponentTemp = this.unlockMedicationComponents.get(0);
                this.unlockMedicationComponents.remove(medicationComponentTemp);
    
                //Adding to the locked ArrayList;
                this.lockMedicationComponents.add(medicationComponentTemp);
    
                return medicationComponentTemp;
            };    
        }
        
        this.lockMedicationComponents.add(medicationComponent);         
        
        //Index of object;
        int medicationComponentIndex = this.lockMedicationComponents.indexOf(medicationComponent);

        return this.lockMedicationComponents.get(medicationComponentIndex);
    }

    //Release the slot of the connection;
    public synchronized void relaseConnection(MedicationComponent medicationComponent) {
        if(this.lockMedicationComponents.contains(medicationComponent) == false)
            return;

        //Removing the medicationComponent from the LockedComponents;
        this.lockMedicationComponents.remove(medicationComponent);

        if(medicationComponent.getLabel().equalsIgnoreCase("Container") || medicationComponent.getLabel().equalsIgnoreCase("Box")) { 
            this.unlockMedicationComponents.add(medicationComponent);
        }

        return;
    }
}