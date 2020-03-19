package reutilization;

import java.util.ArrayList;

import transport.MedicationComponent;

/**
 * ObjectPool
 */
public class ObjectPool {
    //Instantiating ObjectPool;
    private static ObjectPool objectPoolInstance = null;
    
    //ArrayList to Store Objects;
    private ArrayList<MedicationComponent> lock, unlock = new ArrayList<MedicationComponent>();;

    //ArrayList Sizes;
    private int size = 10;

    //Constructor;
    private ObjectPool() {
    };

    //Methods;
    public static ObjectPool getObjectPool() {
        if(objectPoolInstance == null)
            objectPoolInstance = new ObjectPool();

        return objectPoolInstance;
    }

    public synchronized MedicationComponent acquireConnection() {
        if(this.lock.size() > size)
            throw new Error("Locked ArrayList is full!");
        
        MedicationComponent newObject;

        if(this.unlock.isEmpty() == true) {
            //No connections available;
            throw new Error("Unlocked ArrayList is empty!");
        } else {
            newObject = this.unlock.get(0);
            this.unlock.remove(newObject);
        }

        this.lock.add(newObject);

        return newObject;
    } 

    public synchronized void releaseConnection(MedicationComponent object) {
        if(this.lock.contains(object) != true)
            throw new Error("Object not found in the ArrayList");
        
        this.lock.remove(object);
        this.unlock.add(object);
    } 

}