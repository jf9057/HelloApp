import java.util.Scanner;
public class Lesson12 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       /* String name = "Joshua Francis";
        int string_length = name.length();
        System.out.printf("The length of the string : %s is %d",name,string_length);
        char letter = name.charAt(0);
        System.out.println("/n");
        System.out.printf("%s",letter);
        System.out.println("/n");
        int letter_index = name.indexOf("F");
        System.out.printf("The index of the letter F is : %d",letter_index);
        System.out.println("/n");
        name = name.toUpperCase();
        System.out.println(name);
        name=name.toLowerCase();
        System.out.println(name);
        String NewName = "      Brian May       ";
        System.out.println(NewName);
        NewName = NewName.trim();
        System.out.println(NewName);
        NewName = NewName.replace("B","M");
        System.out.println(NewName);
        System.out.println(NewName.isEmpty());*/
     /*String name;
     System.out.print("Enter your name: ");
     name = scanner.nextLine();
     if (name.isEmpty()){
        System.out.println("Your name is empty? Try again");
        main(args);
     }
     else{
        System.out.println("Hey "+name);
     }
     if (name.contains(" ")){
        System.out.println("Your name containss a space");

     }
     else{
        System.out.println("Your name doesn't contain a space.");

     }
     */
    String Password = "Josh123$";
    String input_pass;
    System.out.println("Enter password : ");
    input_pass = scanner.nextLine();
    if (input_pass.equals("Josh123$")){
        System.out.println("Wellcome to the app");
    }
      
    else{
        System.out.println("Wrong password ");
        
    }
       
       
       
       
       
       
       
       
        scanner.close();
    }
}
