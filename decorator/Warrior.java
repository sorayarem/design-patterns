package decorator;

/**
 * A Warrior.
 * @author Soraya Remaili
 */
public class Warrior extends Player
{
    /**
     * Creates a new Warrior with the given name and corresponding text file.
     * @param name The name of the Warrior.
     */
	public Warrior(String name)
    {
        super(FileReader.getLines("txt/warrior.txt"),name);
    }

}
