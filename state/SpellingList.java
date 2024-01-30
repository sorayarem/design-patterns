package state;

/**
 * The SpellingList of a State object.
 * @author Soraya Remaili
 */
public class SpellingList
{
    State state;
    FirstGradeState firstGradeState;
    SecondGradeState secondGradeState;
    ThirdGradeState thirdGradeState;

    /**
     * Creates a SpellingList object and initializes its fields.
     */
    public SpellingList()
    {
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
        state = firstGradeState;
    }

    /**
     * Creates a string representation of a randomly selected a word from the State's words.
     * @return A string representation of the random word.
     */
    public String getNextWord()
    {
        return state.getNextWord();
    }

    /**
     * Increments the grade by one or displays explanatory message.
     */
    public void increaseGrade()
    {
        state.increaseGrade();
    }

    /**
     * Decrements the grade by one or displays explanatory message.
     */
    public void decreaseGrade()
    {
        state.decreaseGrade();
    }

    /**
     * Accessor for the SpellingList's FirstGradeState.
     * @return The SpellingList's FirstGradeState
     */
    public State getFirstGradeState()
    {
        return firstGradeState;
    }

    /**
     * Accessor for the SpellingList's SecondGradeState.
     * @return The SpellingList's SecondGradeState
     */
    public State getSecondGradeState()
    {
        return secondGradeState;
    }

    /**
     * Accessor for the SpellingList's ThirdGradeState.
     * @return The SpellingList's ThirdGradeState
     */
    public State getThirdGradeState()
    {
        return thirdGradeState;
    }

    /**
     * Sets the SpellingList's state to the given State.
     * @param state The state that the SpellingList will be set to.
     */
    public void setState(State state)
    {
        this.state = state;
    }
}
