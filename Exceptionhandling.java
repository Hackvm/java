import java.io.*;
import java.util.*;

class ExceptionHandling {
    public static void main(String args[])throws IOException{
        int a, b; 
        int result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();

        try
        {
            result = a/b;
            System.out.println("Quotention result : " + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ERR: Cannot divide by zero\n" + e);
        }
        finally
        {
            System.out.println("\nFinally Block");
        }
    }
}
