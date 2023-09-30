import java.util.Random;
import java.util.Scanner;
public class Main
{
  private static Scanner sc;

  public static void main (String[]args)
  {
    sc = new Scanner (System.in);
    Random random = new Random ();
    int minRange = 1;
    int maxRange = 100;
    int maxAttempts = 7;
    int score = 0;
      System.out.println ("Welcome to the Number Guessing Game!");
    boolean playAgain = true;
    while (playAgain)
      {
	int targetNumber =
	  random.nextInt (maxRange - minRange + 1) + minRange;
	int attempts = 0;
	boolean guessedCorrectly = false;

	  System.out.println ("\nI'm thinking of a number between " +
			      minRange + " and " + maxRange + ".");
	while (!guessedCorrectly && attempts < maxAttempts)
	  {
	    System.out.print ("Enter your guess: ");
	    int guess = sc.nextInt ();

	    if (guess == targetNumber)
	      {
		System.out.
		  println ("Congratulations! Your guess is correct.");
		guessedCorrectly = true;
	      }
	    else if (guess < targetNumber)
	      {
		System.out.println ("Too low. Try again.");
	      }
	    else
	      {
		System.out.println ("Too high. Try again.");
	      }
	    attempts++;
	  }
	if (!guessedCorrectly)
	  {
	    System.out.
	      println
	      ("Sorry, you've reached the maximum number of attempts. The number was: "
	       + targetNumber);
	  }
	score += maxAttempts - attempts;
	System.out.println ("Your current score is: " + score);

	System.out.print ("Do you want to play again? (yes/no): ");
	String playAgainInput = sc.next ().toLowerCase ();
	playAgain = playAgainInput.equals ("yes");
      }
    System.out.println ("Thank you for playing the Number Guessing Game!");
  }
}
