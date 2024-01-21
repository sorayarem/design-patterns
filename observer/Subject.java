package observer;
import java.util.*;

/**
 * The interface for Subjects.
 * @author Soraya Remaili
 */
public interface Subject 
{
    /**
     * This method adds an Observer to the Subject's list.
     * @param observer The observer to be added.
     */
    public void registerObserver(Observer observer);

    /**
     * This method removes an Observer from the Subject's list.
     * @param observer The observer to be removed.
     */
    public void removeObserver(Observer observer);

    /**
     * /**
     * Updates the information structures of all the Cook's Observers.
     * @param location The location of the sighting.
     * @param description What the subject was doing.
     * @param accomplices Who the subject was seen with.
     */
    public void notifyObservers(String location, String description, ArrayList<String> accomplices);
}
