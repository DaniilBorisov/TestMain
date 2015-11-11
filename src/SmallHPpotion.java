public class SmallHPpotion extends Consumable {

	@Override
	public int value() {
		return 5;
	}
	
	@Override
	public void use(Hero player){
		player.setHealth(player.getHealth() + 25);
	}

	@Override
	public void name() {
		System.out.print("Small HP potion");
	}

}
