package observer;
import java.util.*;

/**
 * The interface for Observers.
 * @author Soraya Remaili
 */
public interface Observer 
{
    /**
     * This method updates the information fields of the Observers.
     * @param location The location of the sighting.
     * @param description What the subject was doing.
     * @param accomplices Who the subject was seen with.
     */
    public void update(String location, String description, ArrayList<String> accomplices);

    /**
     * This method returns a log of the Observer's observations of its Subject.
     */
    public String getLog();
}
