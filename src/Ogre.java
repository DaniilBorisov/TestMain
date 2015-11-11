import java.util.Random;


public class Ogre implements Monster
{
	
	private String _name;
	private int _health;
	private int _armor;
	private int _damage;

	
	public Ogre()
	{
		_name = "Ogre";
		_damage =51;
		_armor = 0;
		_health = 30;

	}
	@Override
	public int attack() 
	{
		int temp;
		Random r = new Random();
		temp = r.nextInt(_damage/3);
		return _damage + temp;
	}

	@Override
	public int defend() {
		return _armor;
	}
	
	 @Override
	public int getHealth()
	{
		return _health;
	}
	public String getName()
	{
		return _name;
	}
	@Override
	public void setHealthDmg(int damage) 
	{
		_health -= damage;
		
	}

}
