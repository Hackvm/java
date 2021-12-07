import java.util.Scanner;

public class Cgpa{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number of Subject");
        int num = s.nextInt();
        float sum=0;
        for (int i=1;i<=num;i++){
            System.out.print("Enter the Marks of Subject"+i+":");
            float a = s.nextInt();
            sum = a+sum;
        }
        float cgp =(sum)/(num*10);
        System.out.println("The CGPA of That Student is: "+cgp);
        System.out.println("\n\n---------------------------Question5 to check the enumber is integer-----------");
        System.out.println("\nif the number is integer it return:True\nif not an integer return:False");
        System.out.print("Enter the Number:");
        System.out.println(s.hasNextInt());

    }
}