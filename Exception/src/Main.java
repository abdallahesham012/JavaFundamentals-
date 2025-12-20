import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        /* Exception = An event that interrupts the normal flow of a program
           (Dividing by zero, file not found, mismatch input type)
            Surround any dangerous code with a try{} block
            try{}, catch{}, finally{}
         */

        System.out.println("First >> Dividing by zero");
        try {
            System.out.println(1/0); // >> the type of error is RuntimeException or ArithmeticException so we put the error at catch
        } catch (RuntimeException e) {
            System.out.println("Can't divide by zero");;
        }

        System.out.println("\nSecond >> Mismatch input");
        try {
            System.out.println("Enter number");
            int x=Integer.valueOf(scan.nextLine());
            System.out.println(x);
        } catch (NumberFormatException e) {
            System.out.println("this is not integer number");
        }

        System.out.println();

        try
        {
            System.out.println(1/0);
        } catch (Exception e) { // i can write Exception e for all error >> i didn't need to write specific error type
            System.out.println("Can't divide by zero");
        }

        System.out.println();

        try {
            System.out.println("Enter number");
            int x=Integer.valueOf(scan.nextLine());
            System.out.println(x);
        } catch (NumberFormatException e) {
            System.out.println("this is not integer number");
        }
        catch (RuntimeException e) {
            System.out.println("Can't divide by zero");;
        }
        finally {
            // u can write anything here like close scanner >> Scanner.close() or delete object it >> always executed if ("true or wrong") error
            System.out.println("this always executed");
        }


    }
}