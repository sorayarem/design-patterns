package strategy;

import java.util.Random;
/**
 * A hockey player.
 * @author Soraya Remaili
 */
public abstract class Player 
{
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand;

     /**
     * Creates a new Player with the indicated first and last name.
     * @param firstName The first name of the Player.
     * @param lastName The last name of the Player.
     */
    public Player(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * This abstract method sets the player's defensive behaviors.
     */
    public abstract void setDefenceBehavior();

    /**
     * This abstract method sets the player's offensive behaviors.
     */
    public abstract void setOffenceBehavior();

    /**
     * Creates a string representation of the player's behavior based on its team's possession.
     * @return A string representation of the player's chosen behavior.
     */
    public String play(boolean possession)
    {
        if(possession)
        {
            this.setOffenceBehavior();
            return offenceBehavior.play();
        }
        this.setDefenceBehavior();
        return defenceBehavior.play();
    }
    
    /**
     * Creates a string representation of the player's name and position.
     * @return A string representation of the player's name and position.
     */
    public String toString()
    {
        return "" + firstName + " " + lastName;
    }


}
