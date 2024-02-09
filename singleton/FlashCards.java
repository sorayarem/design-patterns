import java.util.*;

/**
 * The FlashCards containing Words.
 * @author Soraya Remaili
 */
public class FlashCards 
{
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;

    /**
     * Creates a new FlashCards object and initializes some of its fields.
     */
    private FlashCards()
    {
        rand = new Random();
        words = FileReader.getWords();
    }

    /**
     * Creates a FlashCards object if one does not exist and returns the FlashCards object.
     * @return The FlashCards object flashcards.
     */
    public static FlashCards getInstance()
    {
        if(flashCards == null)
        {
            flashCards = new FlashCards();
        }
        return flashCards;
    }

    /**
     * Creates a string representation of a randomly selected a word from the FlashCards's words and updates the currentWord.
     * @return A string representation of the random word.
     */
    public Word getWord()
    {
        currentWord = (words.get(rand.nextInt(words.size())));
        return currentWord;
    }
    
}
