package observer;
import java.util.*;
public interface Observer 
{
    public void update(String location, String description, ArrayList<String> accomplices);
    public String getLog();
}
