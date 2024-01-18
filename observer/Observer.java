package observer;
import java.util.*;

/**
 * The interface for Observers.
 * @author Soraya Remaili
 */
public interface Observer 
{
    public void update(String location, String description, ArrayList<String> accomplices);
    public String getLog();
}
