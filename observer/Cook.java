package observer;
import java.util.*;

public class Cook implements Subject
{
    private ArrayList<Observer> observers;
    private String name;

    public Cook(String name)
    {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    public void notifyObservers(String location, String description, ArrayList<String> accomplices)
    {
        for(Observer o : observers)
        {
            o.update(location, description, accomplices);
        }
    }

    public void enterSighting(String location, String description, String accomplices)
    {
        ArrayList<String> accList = new ArrayList<String>();
        accList.add(accomplices);
        for(Observer o : observers)
        {
            o.update(location, description, accList);
        }
    }

    public String getName()
    {
        return name;
    }


}
