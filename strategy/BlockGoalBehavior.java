package strategy;

public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior
{
    public String play()
    {
        return "blocks puck with stick";
    }
}
