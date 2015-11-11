public class TwoHandedSword extends Weapon {

	@Override
	public int value() {
		return 100;
	}

	@Override
	public void name() {
		System.out.print("Two Handed Sword");
	}

	@Override
	public int getDmg() {
		return 25;
	}

}
