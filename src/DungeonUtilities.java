import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class DungeonUtilities 
{
	private static final double _EXIT_CHANCE = .5;
	
	private static final double _MONSTER_CHANCE = .8;	
	private static final double _POTION_CHANCE = .3;
	private static final double _TRAP_CHANCE = .2;
	private static final double _BOMB_CHANCE = .1;
	private static final double _TREASURE_CHANCE = .05;
	
	public static GameItem rollForItem()
	{
		Random additionRoll = new Random();
		double type = additionRoll.nextDouble();
		
		GameItem addition;
		
		if(type < _TREASURE_CHANCE)
			addition = ItemFactory.generateTreasure();
		else if(type < _BOMB_CHANCE)
			addition = ItemFactory.generateBomb();
		else if(type < _POTION_CHANCE)
			addition = ItemFactory.generatePotion();
		else if(type < _TRAP_CHANCE)
			addition = ItemFactory.generateTrap();
		else if(type < _MONSTER_CHANCE)
			addition = ItemFactory.generateMonster();
		else
			addition = ItemFactory.generateBlank();

		return addition;
	}
	
	public static boolean rollForExit() 
	{
		Random exitRoll = new Random();
		
		if(exitRoll.nextDouble() < _EXIT_CHANCE)
			return true;
		
		return false;
	}
	
	public static Consumable pickItem(LinkedList<InventoryItem> items)
	{
		System.out.println("Which item would you like to use?");

		Consumable temp = null;
		
		Scanner kb = new Scanner(System.in);
		String choice = kb.nextLine();
		
		temp = (Consumable) items.getFirst();
		while(!temp.toString().equalsIgnoreCase(choice))
			temp = 
			
			
		
		return temp;
	}

	public static Hero pickHero(heroParty party)
	{
		return new Warrior();
	}
}
