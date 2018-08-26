import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int secretNumber = 5;
		
		System.out.println("Welcome to our guessing game!");
		System.out.println("Chose a number between 1 and 10:");
		int guessedNumber = input.nextInt();

		String result;
		if (secretNumber == guessedNumber){
				result = "You won!";
			//System.out.println("You guessed correctly");
		}		else {
				result = "You lost!";
			//System.out.println("You were wrong.");
				System.out.println(result);
		}
	}
	input.close();
}
