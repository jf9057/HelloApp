package org.example;



public class HelloApp {
    public static void main(String[] args) {
        /*String name;
        name = args[0];
        System.out.println("Hello "+name);*/
        if (args.length>0){
            System.out.println("Command Line Arguments Are :");

            for (String arguments : args){
                System.out.print(arguments +" ");


        }
    }
}
}

