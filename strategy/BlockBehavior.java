package strategy;
/**
 * The blocking behavior for a non-goalie player on defence.
 * @author Soraya Remaili
 */
public class BlockBehavior implements DefenceBehavior
{
    /**
     * Creates a string representation of a blocking behavior selected randomly from 3 options.
     * @return A string representation of the blocking action.
     */
    public String play()
    {
        int chance = (int)(Math.random()*2);
        if(chance == 0)
            return "blocks player from passing";
        else if (chance == 1)   
            return "blocks player from shooting";
        else
            return "checks player with puck";
    }
}
