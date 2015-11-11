import java.util.LinkedList;

public class Player
{
	private String _name;
	private boolean _playing;
	private LinkedList<InventoryItem> _inventory;
	private heroParty _heros;
	
	public Player(String name)
	{
		_name = name;
		_playing = true;
		_heros = new heroParty();
		_inventory = new LinkedList<InventoryItem>();
	}
	
	public boolean playing() { return _playing; }
	public void togglePlaying() { _playing = !_playing; }
	
	public String toString()
	{
		return _name;
	}

	public LinkedList<InventoryItem> getInventory()
	{
		return _inventory;		
	}
	
	public void showInventory()
	{
		for(InventoryItem i : _inventory)
			System.out.println(i);
	}

	public heroParty getParty()
	{
		return _heros;
	}
	
	public void showStats()
	{
		System.out.println("Print character stats here (hp/score etc?");
	}
	public heroParty getHeroParty()
	{
		return _heros;
	}
}
