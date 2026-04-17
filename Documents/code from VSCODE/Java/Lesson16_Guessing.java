import java.util.Random;
import java.util.Scanner;
public class Lesson16_Guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guessed_num;
        int fixed_num = random.nextInt(1,100);
            //System.out.println(fixed_num);
        Boolean Condition = true;
        do{
            System.out.print("Guess the number between 1 and 100 : ");
            guessed_num = scanner.nextInt();
            scanner.nextLine();
            if(guessed_num>100){
                System.out.println("Invalid number");
                break;
            }
            if(guessed_num>fixed_num){
                System.out.println("The Guess is too high, Try again");
            }
            else if(guessed_num<fixed_num){
                System.out.println("The Guess is too low, Try again");
            }
            else if(guessed_num==fixed_num){
                Condition = false;
                System.out.println("You Guessed Right!!");
            }


        }while (Condition);













        scanner.close();
    }
}
