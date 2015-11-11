public class BronzeArmor extends Armor{

	@Override
	public int value() {
		return 35;
	}

	@Override
	public void name() {
		System.out.print("Bronze Armor");
	}

	@Override
	public int damageReduct() {
		return 10;
	}

}
