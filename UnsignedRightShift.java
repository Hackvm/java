import java.util.*;
public class UnsignedRightShift{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a Positive Value for x :");
        int a = s.nextInt();
        System.out.print("Enter a Negative Value for y :");
        int b = s.nextInt();
        System.out.println(a >>> 2);
        System.out.println(b >>> 24); 
    }
}