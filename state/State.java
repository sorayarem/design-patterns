package state;
import java.util.*;

/**
 * The State of a student.
 * @author Soraya Remaili
 */
public abstract class State
{
    protected SpellingList spellingList;
    protected ArrayList<String> words;
    private Random rand;

    /**
     * Initializes the fields of the State object with the given value.
     * @param spellingList The SpellingList object of the State.
     */
    public State(SpellingList spellingList)
    {
        this.spellingList = spellingList;
        words = new ArrayList<String>();
        rand = new Random();
    }

    /**
     * Creates a string representation of a randomly selected a word from the State's words.
     * @return A string representation of the random word.
     */
    public String getNextWord()
    {
        return(words.get(rand.nextInt(words.size())));
    }

    /**
     * Increments the grade by one or displays explanatory message.
     */
    public abstract void increaseGrade();

    /**
     * Decrements the grade by one or displays explanatory message.
     */
    public abstract void decreaseGrade();


}
