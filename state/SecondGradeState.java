package state;

public class SecondGradeState extends State
{
    public SecondGradeState(SpellingList spellingList)
    {
        super(spellingList);
        words = getWords("txt/second.txt");
    }
    
    public void increaseGrade()
    {
        spellingList.setState(thirdGradeState);
    }

    public void decreaseGrade()
    {
        spellingList.setState(firstGradeState);
    }

}
