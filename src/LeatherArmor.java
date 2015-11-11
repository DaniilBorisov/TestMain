public class LeatherArmor extends Armor{

	@Override
	public int value() {
		return 25;
	}

	@Override
	public void name() {
		System.out.print("Leather Armor");		
	}

	@Override
	public int damageReduct() {
		return 5;
	}

}
