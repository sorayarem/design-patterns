package decorator;

import java.util.ArrayList;

public abstract class PlayerDecorator extends Player
{
	private Player player;

	public PlayerDecorator(Player player)
	{
		super(player.lines, player.name);
		this.player = player;
	}

	protected void integrateDecor(ArrayList<String> decor)
	{
		for(int i = 0; i<lines.size(); i++)
		{
			for(int j = 0; j<Math.min(decor.get(i).length(), lines.get(i).length()); j++)
			{
				if(decor.get(i).charAt(j) != ' ')
					{
						lines.set(i, lines.get(i).substring(0, j) + decor.get(i).charAt(j) + lines.get(i).substring(j+1));
					}
			}
			if(lines.get(i).length()<decor.get(i).length())
			{
				lines.set(i, (lines.get(i)+decor.get(i).substring(lines.get(i).length())));
			}
		}
	}

}
