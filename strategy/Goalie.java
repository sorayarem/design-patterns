package strategy;
/**
 * A hockey player who plays the position of Goalie.
 * @author Soraya Remaili
 */
public class Goalie extends Player
{
    /**
     * Creates a new Goalie with the indicated first and last name.
     * @param firstName The first name of the Goalie.
     * @param lastName The last name of the Goalie.
     */
    public Goalie(String firstName, String lastName)
    {
        super(firstName, lastName);
    }
    /**
     * Sets the offensive behavior of the Goalie.
     */
    public void setOffenceBehavior()
    {
        offenceBehavior = new BlockGoalBehavior();
    }
    /**
     * Sets the defensive behavior of the Goalie.
     */
    public void setDefenceBehavior()
    {
        defenceBehavior = new BlockGoalBehavior();
    }
    /**
     * Creates a string representation of the player's name and position.
     * @return A string representation of the player's name and position.
     */
    public String toString()
    {
        return super.toString() + " plays the position: Goalie";
    }

}
