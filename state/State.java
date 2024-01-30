package state;
import java.util.*;

public abstract class State
{
    protected SpellingList spellingList;
    protected ArrayList<String> words;
    private Random rand;

    public State(SpellingList spellingList)
    {
        this.spellingList = spellingList;
        rand = new Random();
    }

    public String getNextWord()
    {
        return(words.get(rand.nextInt(words.size())));
    }

    public abstract void increaseGrade();

    public abstract void decreaseGrade();


}
