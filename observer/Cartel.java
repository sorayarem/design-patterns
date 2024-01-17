package observer;
import java.util.*;

public class Cartel implements Observer
{
    private Subject cook;
    private ArrayList<Sighting> sightings;

    public Cartel(Subject cook)
    {
        this.cook = cook;
        cook.registerObserver(this);
        sightings = new ArrayList<Sighting>();
    }

    public void update(String location, String description, ArrayList<String> accomplices)
    {
        sightings.add(new Sighting(location, description, accomplices));
    }
    
    public String getLog()
    {
        String s = "";
        for(Sighting sight : sightings)
            s+=(sight.getLocation() + " (" + sight.getDetails() + "), " + sight.getAccomplices()+ "\n");
        return s;
    }
}
