import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total;
        double item_price;
        int item_num = 0;
        String item_name;
        System.out.println("Enter number of items in your shoping cart: ");
        item_num = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What item would you like to buy : ");
        item_name = scanner.nextLine();
        System.out.println("price per unit of item : ");
        item_price = scanner.nextDouble();
        total = item_price * item_num;
        System.out.println("You have to pay a total of " + "$" + total + " For your " + item_name);

        scanner.close();
    }
}
