package decorator;
/**
 * The Armor for a Warrior.
 * @author Soraya Remaili
 */
public class Armor extends PlayerDecorator
{
    /**
     * Creates a new Armor to be placed on the Warrior.
     * @param player The Player that will 'wear' the Armor.
     */
	public Armor(Player player)
    {
        super(player);
        integrateDecor(FileReader.getLines("txt/armor.txt"));
    }

}
