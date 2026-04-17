import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Enter Age: ");
        age = scanner.nextInt();
        if (age<18){
            System.out.print("You are a child ");
        }
        else if (age<0){
            System.out.print("You're a fetus");
        }
        else{
            System.out.print("You're an adult lol get a job and do your taxes loser");
        }
        
        scanner.close();


    }
}       
