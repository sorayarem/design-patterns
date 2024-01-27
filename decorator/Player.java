package decorator;
import java.util.*;
public abstract class Player 
{
	protected String name;
	protected ArrayList<String> lines;

	public Player(ArrayList<String> lines, String name)
	{
		this.name = name;
		this.lines = lines;
	}

	public String getName()
	{
		return name;
	}

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
