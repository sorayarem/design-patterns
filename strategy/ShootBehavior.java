package strategy;
/**
 * The shooting behavior for an offensive player.
 * @author Soraya Remaili
 */
public class ShootBehavior implements OffenceBehavior
{
    /**
     * Creates a string representation of the offensive player's shooting behavior.
     * @return A string representation of the shooting behavior.
     */
    public String play()
    {
        return "Shoots at the goal";
    }
}
