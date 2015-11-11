public class HugeHPpotion extends Consumable{

	@Override
	public int value() {
		return 50;
	}

	@Override
	public void name() {
		System.out.print("Huge HP potion");
	}

	@Override
	void use(Hero player) {
		player.setHealth(player.getHealth() + 100);
	}

}
