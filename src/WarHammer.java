public class WarHammer extends Weapon {

	@Override
	public int value() {
		return 150;
	}

	@Override
	public void name() {
		System.out.print("War Hammer");
	}

	@Override
	public int getDmg() {
		return 35;
	}

}
