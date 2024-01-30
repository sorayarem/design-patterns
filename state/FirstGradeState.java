package state;

public class FirstGradeState extends State
{
    public FirstGradeState(SpellingList spellingList)
    {
        super(spellingList);
        words = FileReader.getWords("txt/first.txt");
    }
    
    public void increaseGrade()
    {
        spellingList.setState(spellingList.secondGradeState);
    }

    public void decreaseGrade()
    {
        System.out.println("You can't go below First Grade...");
    }

}
