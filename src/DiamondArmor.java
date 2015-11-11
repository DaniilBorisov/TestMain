public class DiamondArmor extends Armor{

	@Override
	public int value() {
		return 100;
	}

	@Override
	public void name() {
		System.out.print("Diamond Armor");
	}

	@Override
	public int damageReduct() {
		return 55;
	}

}
