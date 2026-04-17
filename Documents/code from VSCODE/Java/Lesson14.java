import java.util.Scanner;
public class Lesson14 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     int num1;
     int num2;
     int num3;
     System.out.println("enter a number: ");
     num1 = scanner.nextInt();
     System.out.println("enter a second number: ");
     num2 = scanner.nextInt();
     System.out.println("enter a third  number: ");
     num3 = scanner.nextInt();
     String result;
     result = (num1>num2 && num1>num3)?"num1 is the biggest":(num2>num3)?"num2 is biggest":"num3 is biggest";
        System.out.println(result);
     
     
     
     
     
     
     
     
     
     
     
     scanner.close();

    }
}
