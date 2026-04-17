import java.util.Scanner;
public class Lesson11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //nested if statements in Java 
        Double price = 9.99;
        char resp_student;
        char resp_senior;
        


        Boolean isStudent;
        Boolean isSenior;
        System.out.print("Are you a student? y/n :");
        resp_student = scanner.next().charAt(0);
        System.out.print("Are you a Senior? y/n :");
        resp_senior = scanner.next().charAt(0);
        if(resp_student=='y'){
            isStudent=true;
        }
        else{
            isStudent=false;
        }
        if(resp_senior=='y'){
            isSenior=true;
        }
        else{
            isSenior=false;
        }



        if (isStudent && isSenior){
            price *= 0.4;
            System.out.printf("Final Price is: %f ",price);
         }
        else if(!isStudent && !isSenior){
            System.out.printf("Final price is: %f ",price);
        }
        else if (isStudent){
            price*=0.7;
            System.out.printf("Final Price is: %f ",price);
        }
        else if(isSenior){
            price*=0.7;
            System.out.printf("Final Price is: %f ",price);
        }        
        else{
            price*=1;
            System.out.printf("Final Price is: %f ",price);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        scanner.close();


    }
}
