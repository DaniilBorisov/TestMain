public class Staff extends Weapon {

	@Override
	public int value() {
		return 150;
	}

	@Override
	public void name() {
		System.out.print("Staff");
	}

	@Override
	public int getDmg() {
		return 40;
	}

}
