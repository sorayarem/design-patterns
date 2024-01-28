package decorator;
import java.util.*;

/**
 * A Player.
 * @author Soraya Remaili
 */
public abstract class Player 
{
	protected String name;
	protected ArrayList<String> lines;

	/**
	 * Creates a new Player with the given lines and name.
	 * @param lines The ArrayList version of the .txt file representation of the Player.
	 * @param name The name of the Player.
	 */
	public Player(ArrayList<String> lines, String name)
	{
		this.name = name;
		this.lines = lines;
	}

	/**
	 * Creates a string representation of the Player's name.
	 * @return A string representation of the name.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Creates a formatted string representation of the Player's lines.
	 * @return A string representation of the Player.
	 */
	public String toString()
	{
		String s = "";
		for(String dec : lines)
		{
			s+= dec + "\n";
		}
		return s;
	}

}
