package observer;
import java.util.*;

public class Police implements Observer
{
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    public Police(Subject cook)
    {
        this.cook = cook;
        locations = new ArrayList<String>();
        people = new ArrayList<String>();
    }

    public void update(String location, String description, ArrayList<String> accomplices)
    {

    }
    
    public String getLog()
    {
        
    }

}
