package state;

/**
 * The State of a First Grade student.
 * @author Soraya Remaili
 */
public class FirstGradeState extends State
{
    /**
     * Creates a new FirstGradeState object with the corresponding text file.
     * @param spellingList The SpellingList object of the FirstGradeState.
     */
    public FirstGradeState(SpellingList spellingList)
    {
        super(spellingList);
        words = FileReader.getWords("txt/first.txt");
    }
    
    /**
     * Increases the grade to reflect a SecondGradeState.
     */
    public void increaseGrade()
    {
        spellingList.setState(spellingList.secondGradeState);
        System.out.println("Moving to Second Grade...");
    }

    /**
     * Indicates to the user that the grade cannot be lower than First Grade.
     */
    public void decreaseGrade()
    {
        System.out.println("You can't go below First Grade...");
    }

}
