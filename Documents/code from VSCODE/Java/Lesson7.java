import java.util.Scanner;
import java.util.Random;

public class Lesson7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean coin;
        int number;
        number = random.nextInt(1, 9);
        System.out.println("The number is :" + " " + number);
        coin = random.nextBoolean();
        System.out.println(coin);

        scanner.close();
    }
}
