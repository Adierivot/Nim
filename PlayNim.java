import java.util.Scanner;


/**
* This class conducts the game using all the other classes
*
* @author Ashley Dierivot
*/

public class PlayNim {

	int marbles;
	int removed;
	int count = 1;
	int num;
	boolean gameOver = (marbles == );
	String a;
	String b;
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
		
	
	} while(!gameOver);
