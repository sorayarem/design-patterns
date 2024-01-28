package decorator;

/**
 * The Sword for a Warrior.
 * @author Soraya Remaili
 */
public class Sword extends PlayerDecorator
{
    /**
     * Creates a new Sword to be placed on the Warrior.
     * @param player The Player that will 'hold' the Sword.
     */
	public Sword(Player player)
    {
        super(player);
        integrateDecor(FileReader.getLines("txt/sword.txt"));
    }

}
