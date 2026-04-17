import java.util.Scanner; //for accepting objectse etc etc
//using next() will alow u to enter sopaces while nestLine is for a new line nextDouble si ofr doubles and nextInt for integers

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("My name is : ");
        String name = scanner.nextLine();
        System.out.print("My Age is : ");
        int age = scanner.nextInt();
        System.out.print("My GPA is : ");
        double GPA = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("how many chinchillas do u want? ");
        int num = scanner.nextInt();
        System.out.println(name + age + GPA + num);
        scanner.close();

    }
}
