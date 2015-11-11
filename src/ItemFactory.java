
public class ItemFactory
{
	public static GameItem generateItem() 
	{
		return DungeonUtilities.rollForItem();
	}

	public static GameItem generateTreasure()
	{
		return null;
		//return new InventoryItem("treasure");
	}

	public static GameItem generateBomb()
	{
		return null;
		//return new GameItem("a bomb");
	}
	
	public static GameItem generateTrap()
	{
		return null;
		//return new GameItem("a trap");
	}
	
	public static GameItem generatePotion()
	{
		return null;
		//return new GameItem("a potion");
	}

	public static GameItem generateMonster()
	{
		return MonsterFactory.generateMonster();
	}

	public static GameItem generateBlank()
	{
		return null;
		//return new GameItem("nothing...");
	}
}
