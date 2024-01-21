package observer;
import java.util.*;

/**
 * The meth cook, Heisenberg.
 * @author Soraya Remaili
 */
public class Cook implements Subject
{
    private ArrayList<Observer> observers;
    private String name;

     /**
     * Creates a new Cook that contains a list of observers.
     * @param name The name of the cook.
     */
    public Cook(String name)
    {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    /**
     * Adds a new observer to the Cook's list.
     * @param observer The observer to be added.
     */
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    /**
     * Removes an observer from the Cook's list.
     * @param observer The observer to be removed.
     */
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    /**
     * Updates the information structures of all the Cook's Observers.
     * @param location The location of the sighting.
     * @param description What the subject was doing.
     * @param accomplices Who the subject was seen with.
     */
    public void notifyObservers(String location, String description, ArrayList<String> accomplices)
    {
        for(Observer o : observers)
        {
            o.update(location, description, accomplices);
        }
    }

    /**
     * Enters a new sighting into the information structures of all of the observers.
     * @param location The location of the sighting.
     * @param description What the subject was doing.
     * @param accomplices Who the subject was seen with.
     */
    public void enterSighting(String location, String description, String accomplices)
    {
        ArrayList<String> accList = new ArrayList<String>(Arrays.asList(accomplices.split(", ")));
        notifyObservers(location, description, accList);
    }

    /**
     * Creates a string representation of the Cook's name.
     * @return A string representation of the name.
     */
    public String getName()
    {
        return name;
    }


}
