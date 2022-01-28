import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int x;
        String FirstName;
        int y = 5;
        String S = "Hi";

        Scanner sc = new Scanner(System.in);        //Scanner statement


        System.out.println("Enter Name");
        FirstName = sc.nextLine();               //Read user input

        System.out.println( S+" "+ FirstName);


        System.out.println("Enter first number");   //Tell user to enter first name
        x = sc.nextInt();

        

       
        System.out.println(x + y);

       
 
    }
}