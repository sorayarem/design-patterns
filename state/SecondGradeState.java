package state;

/**
 * The State of a Second Grade student.
 * @author Soraya Remaili
 */
public class SecondGradeState extends State
{
    /**
     * Creates a new SecondGradeState object with the corresponding text file.
     * @param spellingList The SpellingList object of the SecondGradeState.
     */
    public SecondGradeState(SpellingList spellingList)
    {
        super(spellingList);
        words = FileReader.getWords("txt/second.txt");
    }
    
    /**
     * Increases the grade to reflect a ThirdGradeState.
     */
    public void increaseGrade()
    {
        spellingList.setState(spellingList.thirdGradeState);
    }

    /**
     * Decreases the grade to reflect a FirstGradeState.
     */
    public void decreaseGrade()
    {
        spellingList.setState(spellingList.firstGradeState);
    }

}
