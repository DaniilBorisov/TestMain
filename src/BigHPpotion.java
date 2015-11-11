
public class BigHPpotion extends Consumable{

	@Override
	public int value() {
		return 10;
	}

	@Override
	public void name() {
		System.out.print("Big HP potion");
	}

	@Override
	void use(Hero player) {
		player.setHealth(player.getHealth() + 50);
	}

}
