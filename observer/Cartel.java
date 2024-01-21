package observer;
import java.util.*;
/**
 * The drug cartel tracking Heisenberg.
 * @author Soraya Remaili
 */
public class Cartel implements Observer
{
    private Subject cook;
    private ArrayList<Sighting> sightings;

    /**
     * Creates a new Cartel that watches the indicated Subject.
     * @param cook The subject that the Cartel is observing.
     */
    public Cartel(Subject cook)
    {
        this.cook = cook;
        cook.registerObserver(this);
        sightings = new ArrayList<Sighting>();
    }

    /*
     * Adds a new sighting to the Cartel's list with the given information.
     */
    public void update(String location, String description, ArrayList<String> accomplices)
    {
        sightings.add(new Sighting(location, description, accomplices));
    }
    
    /**
     * Creates a string representation of the log of the Cartel's sightings.
     * @return A string representation of the Cartel's sightings.
     */
    public String getLog()
    {
        String s = "";
        for(Sighting sight : sightings)
            s+=(sight.getLocation() + " (" + sight.getDetails() + "), " + sight.getAccomplices()+ "\n");
        return s;
    }
}
