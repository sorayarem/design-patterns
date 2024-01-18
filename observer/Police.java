package observer;
import java.util.*;

/**
 * The police force tracking Heisenberg.
 * @author Soraya Remaili
 */
public class Police implements Observer
{
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    /**
     * Creates a new Police that watches the indicated Subject.
     * @param cook The subject that the Police is observing.
     */
    public Police(Subject cook)
    {
        this.cook = cook;
        cook.registerObserver(this);
        notes = "";
        locations = new ArrayList<String>();
        people = new ArrayList<String>();
    }

     /*
     * Updates the Police's information fields with the given information.
     */
    public void update(String location, String description, ArrayList<String> accomplices)
    {
        locations.add(location);
        notes += ("\n- " + description);
        for(String s : accomplices)
            if(!people.contains(s))
                people.add(s);
    }
    
    /**
     * Creates a string representation of the log of the Police's gathered information.
     * @return A string representation of the Police's information.
     */
    public String getLog()
    {
        String s = "Locations:";
        for(String a : locations)
            s+=("\n- " + a);
        s+= "\n\nNotes:"+ notes;
        s+="\n\nAccomplices:";
        for(String a : people)
            s+=("\n- " + a);
        return s;
    }

}
