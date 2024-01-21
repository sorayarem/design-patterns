package observer;
import java.util.*;

/**
 * A sighting of a Subject.
 * @author Soraya Remaili
 */
public class Sighting 
{
    private String location;
    private String details;
    private ArrayList<String> accomplices;

    /**
     * Creates a new Sighting that details the Subject's actions.
     * @param location The Subject's location.
     * @param details What the subject is doing.
     * @param accomplices Who the subject is with.
     */
    public Sighting(String location, String details, ArrayList<String> accomplices)
    {
        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }

    /**
     * Creates a string representation of the Sighting's location.
     * @return A string representation of the location.
     */
    public String getLocation()
    {
        return location;
    }

    /**
     * Creates a string representation of the Sighting's details.
     * @return A string representation of the details.
     */
    public String getDetails()
    {
        return details;
    }

    /**
     * Creates a formatted string representation of the accomplice list.
     * @return A list of the Subject's accomplices.
     */
    public String getAccomplices()
    {
        return ("with " + accomplices.toString().substring(1,accomplices.toString().length()-1));
    }
}
