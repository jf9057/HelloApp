import java.util.Scanner;

public class lesson4_madlib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adj1;
        String adj2;
        String adj3;
        String noun;
        String verb;

        System.out.println("Enter an adjective : ");
        adj1 = scanner.nextLine();
        System.out.println("Enter an adjective : ");
        adj2 = scanner.nextLine();
        System.out.println("Enter an adjective : ");
        adj3 = scanner.nextLine();
        System.out.println("Enter an noun : ");
        noun = scanner.nextLine();
        System.out.println("Enter an Verb : ");
        verb = scanner.nextLine();

        System.out.println("Today i went to a : " + adj1 + " Zoo");
        System.out.println("In the exhibit i saw a " + adj2 + " " + noun);
        System.out.println(noun + " runs to me while " + verb + " his " + adj3 + " chest");
        scanner.close();
    }

}
