

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int a = random.nextInt(1, 100);
		int guess;
		System.out.println("Guess a number between 1-100: ");
		do{
			System.out.print("Enter a guess: ");
			guess = scanner.nextInt();
			if (guess > a) {
				System.out.println("TOO HIGH ! Try again");
			}else if (guess < a)  {
				System.out.println("TOO LOW ! Try again");
			}
		}while(guess != a);
		
		System.out.println("You guessed correctly ! (❁´◡`❁)");
		
		scanner.close();
	}

} 