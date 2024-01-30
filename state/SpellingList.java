package state;

public class SpellingList
{
    State state;
    FirstGradeState firstGradeState;
    SecondGradeState secondGradeState;
    ThirdGradeState thirdGradeState;

    public SpellingList()
    {
        state = new State(this);
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
    }

    public String getNextWord()
    {
        return state.getNextWord();
    }

    public void increaseGrade()
    {
        state.increaseGrade();
    }

    public void decreaseGrade()
    {
        state.decreaseGrade();
    }

    public State getFirstGradeState()
    {
        return firstGradeState;
    }

    public State getSecondGradeState()
    {
        return secondGradeState;
    }

    public State getThirdGradeState()
    {
        return thirdGradeState;
    }

    public void setState(State state)
    {
        this.state = state;
    }
}
