public class IronArmor extends Armor{

	@Override
	public int value() {
		return 50;
	}

	@Override
	public void name() {
		System.out.print("Iron Armor");
	}

	@Override
	public int damageReduct() {
		return 20;
	}

}
