public class RoomPrinter 
{	
	public static void printRoom(Room playerPosition)
	{
		char[][] display = new char[11][11];
		
		for(int x = 0; x < 11; x++)
			for(int y = 0; y < 11; y++)
				display[x][y] = 164;
		
		if (playerPosition.checkNorth())
			addNorth(display, playerPosition.getNorth());
		if (playerPosition.checkEast())
			addEast(display, playerPosition.getEast());
		if (playerPosition.checkSouth())
			addSouth(display, playerPosition.getSouth());
		if (playerPosition.checkWest())
			addWest(display, playerPosition.getWest());
		if (playerPosition.checkDown())
			addDown(display, playerPosition.getDown());
		
		/*
		for(int x = 0; x < 11; x++)
		{
			for(int y = 0; y < 11; y++)
				System.out.print(display[x][y] + " ");
			System.out.println();
		}
		*/
	}

	private static void addDown(char[][] display, Room down)
	{
		// TODO Auto-generated method stub
		
	}

	private static void addWest(char[][] display, Room west)
	{
		// TODO Auto-generated method stub
		
	}

	private static void addSouth(char[][] display, Room south)
	{
		// TODO Auto-generated method stub
		
	}

	private static void addEast(char[][] display, Room east)
	{
		// TODO Auto-generated method stub
		
	}

	private static void addNorth(char[][] display, Room north)
	{
		// TODO Auto-generated method stub
		
	}
}
