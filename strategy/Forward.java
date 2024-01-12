package strategy;

import java.util.Random;
/**
 * A hockey player who plays the position of Forward.
 * @author Soraya Remaili
 */
public class Forward extends Player
{
    /**
     * Creates a new Forward with the indicated first and last name and initializes Random rand.
     * @param firstName The first name of the Forward.
     * @param lastName The last name of the Forward.
     */
    public Forward(String firstName, String lastName)
    {
        super(firstName, lastName);
        rand = new Random();
    }
    /**
     * Sets the offensive behavior of the Forward.
     */
    public void setOffenceBehavior()
    {
        boolean chance = rand.nextBoolean();
        if(chance)
            offenceBehavior = new PassBehavior();
        else    
            offenceBehavior = new ShootBehavior();
    }
    /**
     * Sets the defensive behavior of the Forward.
     */
    public void setDefenceBehavior()
    {
        boolean chance = rand.nextBoolean();
        if(chance)
            defenceBehavior = new ChasePuckBehavior();
        else    
            defenceBehavior = new BlockBehavior();    
    }
    /**
     * Creates a string representation of the player's name and position.
     * @return A string representation of the player's name and position.
     */
    public String toString()
    {
        return super.toString() + " plays the position Forward";
    }
}
