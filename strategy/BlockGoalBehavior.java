package strategy;
/**
 * The blocking behavior for a goalie player.
 * @author Soraya Remaili
 */
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior
{
    /**
     * Creates a string representation of a goalie blocking behavior selected randomly from 4 options.
     * @return A string representation of the blocking behavior.
     */
    public String play()
    {
        int chance = (int)(Math.random()*3);
        if(chance == 0)
            return "hand blocks the puck";
        else if (chance == 1)   
            return "catches the puck";
        else if(chance == 2)
            return "blocks puck with knee pads";
        else
            return "blocks puck with stick";
    }
}
