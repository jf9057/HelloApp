import java.util.Scanner;

public class Lesson8 {
    public static final double PI = Math.PI;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int r;
        int choice1;
        int choice2;
        System.out.println("Choose:");
        System.out.println("1)Sphere");
        System.out.println("2)Circle");
        choice1 = scanner.nextInt();
        System.out.println("Enter Radius : ");
        r = scanner.nextInt();
        System.out.println("Choose:");
        System.out.println("1)Surface area ");
        System.out.println("2)Area/volume");
        choice2= scanner.nextInt();
        if(choice1==1){
            if (choice2==1){
                System.out.println("Surface area of a sphere is :");
                System.out.format("%.3f",  4*PI*Math.pow(r,2));
            }
            else if(choice2==2){
                System.out.println("Volume is : ");
                System.out.format("%.3f", (4/3)*PI*Math.pow(r,3));
            }
        }
        else if(choice1==2){
            
            if (choice2==1){
                System.out.print("Surface area of a circle is :");
                System.out.format("%.3f", 2*PI*Math.pow(r,2));
            }
            else if(choice2==2){
                System.out.println("Circle has no volume");
            }

        }

        
        



        scanner.close();
}

}
