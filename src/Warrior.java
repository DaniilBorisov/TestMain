import java.util.Random;


public class Warrior implements Hero
{
	private int _health;
	private int _armor;
	private int _damage;
	private String _name;
	private boolean _isDead;
	private Weapon _weapon;
	
	public Warrior()
	{
		_weapon =  new Sword();
		_health = 100;
		_armor = 0;
		_damage = 3;
		//_damage += _weapon.getDmg();
		_name = "Warrior";
		_isDead = false;
	}


	@Override
	public int attack() 
	{
		Random r = new Random();
		int temp = r.nextInt(_weapon.getDmg());
		return _damage + temp;
	}

	public void setWeapon(Weapon _weapon)
	{
		this._weapon = _weapon;
	}
	@Override
	public int defend() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int getHealth() 
	{
		return _health;
	}


	public void setHealth(int _health) {
		this._health -= _health;
	}


	public int get_armor() {
		return _armor;
	}


	public void set_armor(int _armor) {
		this._armor = _armor;
	}


	public int get_damage() {
		return _damage;
	}


	public void set_damage(int _damage) {
		this._damage = _damage;
	}


	public String get_name() {
		return _name;
	}


	public void set_name(String _name) {
		this._name = _name;
	}


	@Override
	public String getName() {
		return _name;
	}
	
	public boolean isDead()
	{
		if(_health <= 0)
			_isDead = true;
		return _isDead;
	}

}
