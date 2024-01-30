package state;

public class FirstGradeState extends State
{
    public FirstGradeState(SpellingList spellingList)
    {
        super(spellingList);
        words = getWords("txt/first.txt");
    }
    
    public void increaseGrade()
    {
        spellingList.setState(secondGradeState);
    }

    public void decreaseGrade()
    {
        System.out.println("You can't go below First Grade...");
    }

}
