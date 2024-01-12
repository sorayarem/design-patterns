package strategy;

import java.util.Random;

public class Defenceman extends Player
{
 public Defenceman(String firstName, String lastName)
    {
        super(firstName, lastName);
        rand = new Random();
    }

    public void setOffenceBehavior()
    {
        int chance = rand.nextInt(10);
        if(chance == 9)
            offenceBehavior = new SlapShotBehavior();
        else    
            offenceBehavior = new PassBehavior();
    }
    
    public void setDefenceBehavior()
    {
        boolean chance = rand.nextBoolean();
        if(chance)
            defenceBehavior = new ChasePuckBehavior();
        else    
            defenceBehavior = new BlockBehavior();    
    }
    
    public String toString()
    {
        return super.toString() + " plays the position Defenceman";
    }
}
