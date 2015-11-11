public class RoomFactory 
{
	public static Room generateEmptyRoom(Room sourceRoom)
	{
		Room temp = new Room();
		
		if(temp.getAddition() instanceof DungeonMonster)
			temp.toggleHostileRoom();
		
		rollExits(temp);
		temp.setDepth(sourceRoom.getDepth() + 1);
		return temp;
	}
	
	public static Room generateNorthRoom(Room sourceRoom)
	{
		Room temp = generateEmptyRoom(sourceRoom);
		temp.setSouth(sourceRoom);
		sourceRoom.setNorth(temp);
		return temp;
	}
	
	public static Room generateEastRoom(Room sourceRoom)
	{
		Room temp = generateEmptyRoom(sourceRoom);
		temp.setWest(sourceRoom);
		sourceRoom.setEast(temp);
		return temp;
	}
	
	public static Room generateSouthRoom(Room sourceRoom)
	{
		Room temp = generateEmptyRoom(sourceRoom);
		temp.setNorth(sourceRoom);
		sourceRoom.setSouth(temp);
		return temp;
	}
	
	public static Room generateWestRoom(Room sourceRoom)
	{
		Room temp = generateEmptyRoom(sourceRoom);
		temp.setEast(sourceRoom);
		sourceRoom.setWest(temp);
		return temp;
	}
	
	public static Room generateDownRoom()
	{
		Room temp = new Room();
		temp.toggleDown();
		temp.setDown(new Room());
		temp.setDepth(0);
		return temp;
	}

	private static void rollExits(Room exitMe)
	{
		if(DungeonUtilities.rollForExit())
			exitMe.toggleNorth();
		if(DungeonUtilities.rollForExit())
			exitMe.toggleEast();
		if(DungeonUtilities.rollForExit())
			exitMe.toggleSouth();
		if(DungeonUtilities.rollForExit())
			exitMe.toggleWest();
	}
}
