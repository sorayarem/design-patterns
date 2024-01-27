package decorator;

import java.util.ArrayList;

public abstract class PlayerDecorator
{
	private Player player;

	public PlayerDecorator(Player player)
	{
		this.player = player;
	}

	protected void integrateDecor(ArrayList<String> decor)
	{
		
	}

}
