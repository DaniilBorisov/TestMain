import java.util.*;

public class monsterParty 
{

	private ArrayList<Monster> _monsters;
	
	public monsterParty()
	{
		_monsters = new ArrayList<Monster>();
		_monsters.add(new Goblin()); //hard code
		_monsters.add(new Ogre());
		
		
	}
	
	public String toString()
	{
		String temp = "";
		for(int i = 0; i < _monsters.size(); i++)
		{
			temp += _monsters.get(i).getName() + "\n";
		}
		return temp;
	}
	public ArrayList<Monster> getMonsterParty()
	{
		return _monsters;
	}

	public void remove(int choice) 
	{
		_monsters.remove(choice);
	}

	public Monster getMonster(int choice) 
	{
		return _monsters.get(choice);
	}

	public int size() 
	{
		return _monsters.size();
	}

	
	
}
