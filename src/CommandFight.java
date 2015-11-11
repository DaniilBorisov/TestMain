import java.util.*;

public class CommandFight implements Command
{
	public void execute(Dungeon dungeon, Player player)
	{
		Room temp = dungeon.getPosition();

		//	if (temp.isHostile())
		//	{
		System.out.println(player + " picks a fight with " + dungeon.getPosition().getAddition());

		heroParty _heros = player.getHeroParty();
		monsterParty _monsters = new monsterParty();

		dungeon.getPosition();

		//Heros attack first always

		BattleMediator mediator = new BattleMediator(_heros, _monsters);



		do
		{
			mediator.printBattle();
			if(_heros.size() > 0)
			{
				_monsters = mediator.battle(_heros, _monsters);
			}//I want to return the _monsters that are still alive.

			if(_monsters.size() > 0)
			{
				_heros = mediator.battle(_monsters, _heros);
			}
		}while(_monsters.size() > 0 && _heros.size() > 0);



		//	}
		//	else
		//		System.out.println("You fight the darkness. It might be winning...");
	}
}
