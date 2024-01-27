package decorator;

public class Sword extends PlayerDecorator
{
	public Sword(Player player)
    {
        super(player);
        integrateDecor(FileReader.getLines("txt/sword.txt"));
    }

}
