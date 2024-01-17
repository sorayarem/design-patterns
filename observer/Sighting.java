package observer;
import java.util.*;

public class Sighting 
{
    private String location;
    private String details;
    private ArrayList<String> accomplices;

    public Sighting(String location, String details, ArrayList<String> accomplices)
    {
        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }

    public String getLocation()
    {
        return location;
    }

    public String getDetails()
    {
        return details;
    }

    public String getAccomplices()
    {
        return ("with " + accomplices.toString().substring(1,accomplices.toString().length()-1));
    }
}
