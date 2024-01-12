package strategy;
/**
 * The passing behavior for an offensive player.
 * @author Soraya Remaili
 */
public class PassBehavior implements OffenceBehavior
{
    /**
     * Creates a string representation of the offensive player's passing behavior.
     * @return A string representation of the passing behavior.
     */
    public String play()
    {
        return "Passes to a forward";
    }
}
