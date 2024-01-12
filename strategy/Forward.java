package strategy;

import java.util.Random;

public class Forward extends Player
{
    public Forward(String firstName, String lastName)
    {
        super(firstName, lastName);
        rand = new Random();
    }

    public void setOffenceBehavior()
    {
        boolean chance = rand.nextBoolean();
        if(chance)
            offenceBehavior = new PassBehavior();
        else    
            offenceBehavior = new ShootBehavior();
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
        return super.toString() + " plays the position Forward";
    }
}
