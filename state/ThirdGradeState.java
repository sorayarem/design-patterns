package state;

/**
 * The State of a Third Grade student.
 * @author Soraya Remaili
 */
public class ThirdGradeState extends State
{
    /**
     * Creates a new ThirdGradeState object with the corresponding text file.
     * @param spellingList The SpellingList object of the ThirdGradeState.
     */
    public ThirdGradeState(SpellingList spellingList)
    {
        super(spellingList);
        words = FileReader.getWords("txt/third.txt");
    }
    
    /**
     * Indicates to the user that the grade cannot be higher than Third Grade.
     */
    public void increaseGrade()
    {
        System.out.println("Sorry, we currently only have up to third grade in our system...");
    }

    /**
     * Decreases the grade to reflect a SecondGradeState.
     */
    public void decreaseGrade()
    {
        spellingList.setState(spellingList.getSecondGradeState());
    }

}
