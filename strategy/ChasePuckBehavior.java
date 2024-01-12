package strategy;
/**
 * The chase puck behavior for a player on defence.
 * @author Soraya Remaili
 */
public class ChasePuckBehavior implements DefenceBehavior
{
    /**
     * Creates a string representation of the chase puck behavior.
     * @return A string representation of the chase puck behavior.
     */
    public String play()
    {
        return "Chases the puck";
    }
}
