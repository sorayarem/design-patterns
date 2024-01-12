package strategy;

import java.util.Random;
/**
 * A hockey player who plays the position of Defenceman.
 * @author Soraya Remaili
 */
public class Defenceman extends Player
{
    /**
     * Creates a new Defenceman with the indicated first and last name and initializes Random rand.
     * @param firstName The first name of the Defenceman.
     * @param lastName The last name of the Defenceman.
     */
 public Defenceman(String firstName, String lastName)
    {
        super(firstName, lastName);
        rand = new Random();
    }
    /**
     * Sets the offensive behavior of the Defenceman.
     */
    public void setOffenceBehavior()
    {
        int chance = rand.nextInt(10);
        if(chance == 9)
            offenceBehavior = new SlapShotBehavior();
        else    
            offenceBehavior = new PassBehavior();
    }
    /**
     * Sets the defensive behavior of the Defenceman.
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
        return super.toString() + " plays the position Defenceman";
    }
}
