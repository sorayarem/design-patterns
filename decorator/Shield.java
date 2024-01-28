package decorator;

/**
 * The Shield for a Warrior.
 * @author Soraya Remaili
 */
public class Shield extends PlayerDecorator
{
    /**
     * Creates a new Shield to be placed on the Warrior.
     * @param player The Player that will 'hold' the Shield.
     */
	public Shield(Player player)
    {
        super(player);
        integrateDecor(FileReader.getLines("txt/shield.txt"));
    }

}
