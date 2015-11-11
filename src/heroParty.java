import java.util.*;


public class heroParty 
{
	private ArrayList<Hero> _heros;
	public heroParty()
	{
		_heros = new ArrayList<Hero>();
		//_heros = heroSelect();
		
		
		_heros.add(new Warrior()); //tester hard code.
		_heros.add(new Mage());

		
	}
	public heroParty(ArrayList<Hero> _heros)
	{
		this._heros = _heros;
	}
	
	public ArrayList<Hero> heroSelect()
	{
		int count = 0;
		int temp;
		ArrayList<Hero> _hero = new ArrayList<Hero>();
		
		Scanner kb = new Scanner(System.in);
		do
		{
			System.out.println("Please select a Hero class");
			System.out.println("1\tWarrior");
			System.out.println("2\tMage");
			System.out.println("3\tRouge");
			System.out.println("4\tAlien");
			System.out.println("5\tChuck Norris");
			System.out.print("User Choice --> ");
			temp = kb.nextInt();
			count++;
			
			
			
			if(temp == 1)
				_hero.add(new Warrior());
			/*else if(temp == 2)
				_hero.add(new Mage());
			else if(temp == 3)
				_hero.add(new Rouge);
			else if(temp == 4)
				_hero.add(new Alien);
			else if(temp == 5)
				_hero.add(new ChuckNorris());*/
								
		}while(count<3);
		
		kb.close();


		return _hero;
	}
	public String toString()
	{
		String temp = "";
		for(int i = 0; i < _heros.size(); i++)
		{
			temp += _heros.get(i).getName() + "\n";
		}
		return temp;
	}

	

	public ArrayList<Hero> getHeroParty()
	{
		return _heros;
	}

	public Hero getHero(int choice) {
		return _heros.get(choice);
	}

	public int size() 
	{
		return _heros.size();
	}

	public void remove(int temp) 
	{
		this._heros.remove(temp);
		
	}
}
