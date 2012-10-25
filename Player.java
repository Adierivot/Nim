import java.util.Random;
import java.util.Scanner;

/**
* This is the player interface that provides methods to be used in the Human, 
* Stupid and Smart classes
*/

public interface Player{

/**
* Computes marbles left after move
* @param marbles the number of marbles in the pile
* @return the number of marbles after move
*/

int move(int marbles);

/**
* Gets the name of the player
* @return name of player
*/
String getName();

}

class Human implements Player {

private int remove;
String name;

/**
* Gets the name of the player 
* @return the name of the player 
*/

public String getName(){
	Scanner scan = new Scanner(System.in);
	System.out.print("What is your name?  ");
	name = scan.nextLine();
	return name;
}

/**
* Conducts the move for the player and returns the number of marbles left
* It also makes sure the human player does not cheat
* @param marbles the number of marbles in the pile
* @return the number of marbles remaining after move
*/

public int move(int marbles){
	int count = 0; //counter for error message
	Scanner scan= new Scanner(System.in);
	System.out.print("Hey " + name + ", How many marbles do you " + "want to remove?  ");
	remove = scan.nextInt();

	boolean goodInput = (remove <= ((marbles/2))) && (remove > 0);
	
	while(!goodInput) // user cannot follow directions  
	{
		count++;
		if(count >= 3) {
			System.out.println("Are you serious?");
		} else {
			System.out.println("Ididot the number must be half or less than\n the current number of the marbles in the pile \n and it cannot be zero or less than zero");
			    }
	 System.out.println("Soo...How many marbles do you want to remove?  ");
	 remove = scan.nextInt();
	 goodInput = (remove <= ((marbles/2))) && (remove > 0);
	}
	
	if(remove >1) {
		System.out.println(name + " has removed " + remove + " marbles");
	} else {
		System.out.println(name + " has removed 1 marble");
			}
	return remove; 
	}
}


/**
* This is the stupid computer class.
* The computer removes a random number of 
* marbles between 1 and n/2 each turn
*/
class Stupid implements Player {
	private int remove; 
	String name;
	
/**
* Gets the name of the player
* @return the name of the player
*/

public String getName() {
	Scanner scan = new Scanner(System.in);
	System.out.print("What is the stupid computer's name?  ");
	name = scan.nextLine();
	return name;
}

/**
* Conducts the move for the the stupid computer
* and returns the number of marbles left in the pile
* @param marbles the number of marbles in the pile 
* @return the number of marbles remaining after move
*/

public int move(int marbles){

//Generate Random Object 
Random rand = new Random();

//Remove random number of marbles 

remove = (1+ rand.nextInt(marbles/2));

if(remove >1) {
		System.out.println(name + " has removed " + remove + " marbles");
	} else {
		System.out.println(name + " has removed 1 marble");
			}
	return remove;
	}
}

/**
* This is the smart computer class.
* The smart computer removes exactly enough marbles to make the 
* remaining pile a power of two minus one (1, 3, 7, 15, 31, or 63)
*/ 

class Smart implements Player {
	private int remove;
	String name;
	
	/**
	* Gets the Name of the player
	* @return the name of the player 
	*/
	public String getName() {
		Scanner scan = new Scanner(System.in);
		System.out.print("What is the smart computer's name?  ");
		name = scan.nextLine();
		return name;
		}
		
	/**
	* Conducts the move for the smart computer and 
	* returns the number fof marbles left
	* @param marbles the number of marbles in the pile 
	* @return the number of marbles remaining after move
	*/
	
	public int move(int marbles) {
	
		Random rand = new Random();
		
		if(marbles == 3 || marbles == 7 || marbles == 15 || marbles == 31 || marbles == 63) {
			//removes random number if values are (3, 7, 15, 31, or 63)
			remove = (1 + rand.nextInt(marbles / 2));
		} else if (marbles > 63) {
			remove = marbles - 63;
		} else if (marbles > 31) {
			remove = marbles - 31;
		} else if (marbles > 15) {
			remove = marbles - 15;
		} else if (marbles > 7) {
			remove = marbles - 7;
		}else if (marbles > 3) {
			remove = marbles - 3;
		} else {
			remove = 1;
		}
		if(remove > 1) {
		System.out.println(name + " has removed " + remove + " marbles");
		}
		 else {
		 	System.out.println(name + " has removed 1 marble");
		 }
		 	return remove;
		 }
}
