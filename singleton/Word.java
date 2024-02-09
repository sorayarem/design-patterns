/**
 * The Word of a FlashCard.
 * @author Soraya Remaili
 */
public class Word 
{
    private String word;
    private String type;
    private String definition;
    private String sentence;
    
    /**
     * Creates a new Word with the specified properties.
     * @param word The name of the Word to be created.
     * @param type The part of speech of the Word.
     * @param definition The definition of the Word.
     * @param sentence A sentence containing the Word.
     */
    public Word(String word, String type, String definition, String sentence)
    {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }

    /**
     * Creates a string representation of the Word itself.
     * @return A string representation of the Word.
     */
    public String getWord()
    {
        return word;
    }

    /**
     * Creates a formatted String representation of the type, definition, and the sentence fields.
     * @return A String representation of the Word's properties.
     */
    public String getDescription()
    {
        return "Part of Speech: " + type + "\n" + "Definition: " + definition + "\n" + sentence;
    }
}
