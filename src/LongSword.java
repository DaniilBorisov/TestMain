public class LongSword extends Weapon {

	@Override
	public int value() {
		return 50;
	}

	@Override
	public void name() {
		System.out.print("Sword");
		
	}

	@Override
	public int getDmg() {
		return 10;
	}

}
