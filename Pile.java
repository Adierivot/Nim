import java.util.Random; 

/**
* This is the pile class that is to be used in the game of nim.
* It delegates the random number of marbles at the start of each game
* and updates the pile when needed 
*
* @author Ashley Dierivot
*/

public class Pile {
	
	public int marbles;		//the amount of marbles in the pile
	
	/**
	* Creates a Pile object
	*/
	
	public Pile()
	{
		Random rand = new Random();
		marbles = rand.nextInt(91)+10;
	}
	
	/**
	* The amount of marbles in the pile
	* @return the amount of marbles in the pile
	*/
	public int getSize()
	{
		return marbles;
	}
	
	/**
	* The amount of marbles in the pile
	* @param removed the umber of marbles removed
	* @return the updated amount of marbles in the pile
	*/
	public int updatedSize(int removed)
	{
		marbles = marbles - removed;
		return marbles;
	}

}	
		
