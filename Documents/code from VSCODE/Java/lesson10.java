import java.util.Scanner;
public class lesson10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double Final;
            float Anual_interest;
            int number;
            int Time;
            double principle;  
        System.out.print("Enter your principle : ");
        principle = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Anual Interest rate : ");
        Anual_interest = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Enter number of times compunded :");
        number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter time over which interest is calculated: ");
        Time =  scanner.nextInt();
        scanner.nextLine();
        double r;
        r = Anual_interest/100;
        double rat = r/number;
        rat = Math.pow(rat+1,number*Time);
        Final = principle*rat;
        System.out.printf("Final Compounded amount is : %,.3f",Final);

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        scanner.close();
    }
}
