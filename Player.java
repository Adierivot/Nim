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
