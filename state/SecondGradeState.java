package state;

public class SecondGradeState extends State
{
    public SecondGradeState(SpellingList spellingList)
    {
        super(spellingList);
        words = FileReader.getWords("txt/second.txt");
    }
    
    public void increaseGrade()
    {
        spellingList.setState(spellingList.thirdGradeState);
    }

    public void decreaseGrade()
    {
        spellingList.setState(spellingList.firstGradeState);
    }

}
