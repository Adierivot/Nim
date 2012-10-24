import java.util.Random; 

public class Pile {
	
	public int marbles;
	
	public pile()
	{
		Random rand = new Random();
		marbles = rand.nextInt(91)+10;
	}
	
	public int getSize()
	{
		return marbles;
	}
	
	
	public int updatedSize(int removed)
	{
		marbles = marbles - removed;
		return marbles
	}

}	
		
