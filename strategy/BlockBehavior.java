package strategy;

public class BlockBehavior implements DefenceBehavior
{
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
