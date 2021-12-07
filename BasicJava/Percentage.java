import java.util.Scanner;

public class Percentage{

    public  static void main(String[] args ){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of subject:");
        int num = s.nextInt();
        System.out.println("Enter the outof marks in one subject");
        int outoff = s.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            System.out.print("Enter the marks in subject"+i+":");
            int a = s.nextInt();
            sum = a + sum;
        }
        int perc = (sum*100)/(num*outoff);
        System.out.print("The percentage of that student is: " + perc);
    }
}



