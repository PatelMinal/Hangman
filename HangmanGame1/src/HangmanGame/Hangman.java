//You are to recreate the children's game "Hangman" in Java.

//Hangman is a paper and pencil guessing game for two or more players. 
//One player thinks of a word, phrase or sentence and the other(s) tries to guess it by suggesting letters,
//within a certain number of guesses.

//The word to guess is represented by a row of dashes, representing each letter of the word. 
//If the guessing player suggests a letter which occurs in the word, the other player writes it in all its correct positions.
//If the suggested letter does not occur in the word,
//the other player draws one element of a hanged man stick figure as a tally mark.
//The player guessing the word may, at any time, attempt to guess the whole word.
//If the word is correct, the game is over and the guesser wins. Otherwise, 
//the other player may choose to penalize the guesser by adding an element to the diagram. 
//On the other hand, if the other player makes enough incorrect guesses to allow his opponent to complete the diagram,
//the game is also over, this time with the guesser losing.
//However, the guesser can also win by guessing all the letters or numbers that appears in the word, 
//thereby completing the word, before the diagram is completed.


//Your game should also implement the following rules:

//A player cannot guess the same letter more than once.
//A player can only guess letters.
//You should display the hangman diagram in some fashion.
//You should be able to give the player a clue (How you implement this if up to you).

//1. Welcome message 
//2. Need a variable to store the secret word
//3. Need a loop to print dashes of word stored - 
//4. need to get an array of alphabet - loop to make sure same letter is not typed again
//5. need to make sure only letters can be added no integers 
//6. Need to make a Tally for every wrong letter??
//7. Need a loop for player to guess the whole word - game over player wins 
//8. Need a loop for 7 guesses once they are done game is over 
//9. Need a loop for guess to win by following the game 
//10. Clue - Could provide them with a hint like the letter is Vowel? 
//will have to be a loop which will have to look through the word and output the number of vowels it has 
//11. need to code a hangman figure - 

package HangmanGame;

import java.util.Scanner;
//import java.util.random; 
public class Hangman {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner (System.in);
		System.out.println("Welcome to Hangman!");
		
		
		//int length;
		//int attempts = 0
				
				
		

	}

}
