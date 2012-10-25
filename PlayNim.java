import java.util.Scanner;


/**
* This class conducts the game using all the other classes
*
* @author Ashley Dierivot
*/

public class PlayNim {

	int marbles;							//amount of marbles in the pile 
	int removed;							//amount of marbles removed 
	int count = 1;							//count of the game
	int num;								//number that relates to the type of player
	boolean gameOver = (marbles == 1 );		//condition for game to be over
	String a = " Player 1 Wins!!!!! GAME OVER";								//message if player one wins
	String b = " Player 2 Wins!!!!! GAME OVER";							    //message if player two wins
	public PlayNim(){}						
	
/**
* The Play method conducts the game using the pile class and the Player 
* interface. Upon completion of the game, the user will be asked if they 
* would like to play again
*/

public void play() {
	Scanner scan = new Scanner(System.in);
	
	//Create the pile object 
	Pile gamePile = new Pile();
	marbles = gamePile.getSize();
	
	//Create the players
	Player x = null;
	Player y = null;
	
	//Player 1 info
	System.out.print("Player 1? 1 - Human  2 - Stupid  3 - Smart ======  ");
	num = scan.nextInt();
	if(num == 1){
		x = new Human();
	}
	if(num == 2){
		x = new Stupid();
	}
	if(num == 3){
		x = new Smart();
	}
	x.getName();
	
	//Player 2 Info
	System.out.print("Player 2? 1 - Human  2 - Stupid  3 - Smart ======  ");
	num = scan.nextInt();
	if(num == 1){
		y = new Human();
	}
	if(num == 2){
		y = new Stupid();
	}
	if(num == 3){
		y = new Smart();
	}
	y.getName();
	
	System.out.println("Game # " + count);
	
	//Run the game
	do{
		System.out.println("There are now " + marbles + " marbles");
		removed = x.move(marbles);
		marbles = gamePile.updatedSize(removed); // updated pile
		if(marbles == 1) //if game is over
		{
			System.out.println(a);
			break;
		}
		
		System.out.println("There are now " + marbles + " marbles");
		removed = y.move(marbles);
		marbles = gamePile.updatedSize(removed); // updated pile
		if(marbles == 1) // if game is over
		{
			System.out.println(b);
			break;
		}
	
	} while(!gameOver); // while the game is not over yet
	
	System.out.print(" Would you like to play again?  ");
	String input = scan.next();
	if(input.equalsIgnoreCase("Y")) {
		count++;
		System.out.println("Of course, you would!");
		play(); // play again
		
		}
	}
} 
