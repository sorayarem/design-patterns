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
        cook.registerObserver(this);
        locations = new ArrayList<String>();
        people = new ArrayList<String>();
    }

    public void update(String location, String description, ArrayList<String> accomplices)
    {
        locations.add(location);
        notes += ("\n- " + description);
        for(String s : accomplices)
            people.add(s);
    }
    
    public String getLog()
    {
        String s = "Locations:";
        for(String a : locations)
            s+=("\n- " + a);
        s+= "\nNotes:";
        s+= "\n" + notes;
        s+="\nAccomplices:";
        for(String a : people)
            s+=("\n- " + a);
        return s;
    }

}
