package state;

public class ThirdGradeState extends State
{
    public ThirdGradeState(SpellingList spellingList)
    {
        super(spellingList);
        words = getWords("txt/third.txt");
    }
    
    public void increaseGrade()
    {
        System.out.println("Sorry, we currently only have up to third grade in our system...");
    }

    public void decreaseGrade()
    {
        spellingList.setState(secondGradeState);
    }

}
