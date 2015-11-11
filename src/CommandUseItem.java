
public class CommandUseItem implements Command
{
	public void execute(Dungeon dungeon, Player player)
	{
		Consumable item = DungeonUtilities.pickItem(player.getInventory());
		Hero hero = DungeonUtilities.pickHero(player.getParty());
		item.use(hero);		
	}
}
