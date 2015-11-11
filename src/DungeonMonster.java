
public class DungeonMonster implements DungeonItem
{
	private int _level;
	
	public DungeonMonster()
	{
		_level = -1;
	}
	
	public String toString()
	{
		return ("level " + _level + " monster");
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}
}
