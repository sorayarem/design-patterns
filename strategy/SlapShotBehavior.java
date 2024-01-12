package strategy;
/**
 * The slapshot behavior for an offensive player.
 * @author Soraya Remaili
 */
public class SlapShotBehavior implements OffenceBehavior
{
    /**
     * Creates a string representation of the offensive player's slapshot behavior.
     * @return A string representation of the slapshot behavior.
     */
    public String play()
    {
        return "Shoots the puck from the blue line";
    }
}
