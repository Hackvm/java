import java.util.*;
public class DemoBranchingLooping{ 
    public static void main(String[] args){
        String c;
        int fact=1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = s.nextInt();
        do{
            System.out.println("-------------Menu--------------------");
            System.out.println("1.Factorial\n2.Pattern\n");
            System.out.print("Enter the Operation to be performed:");
            int b=s.nextInt();
            switch(b){
                case 1:
                for(int i=1;i<=n;i++){
                    fact = fact*i;
                }
                System.out.println("The Factorial of "+n+" Number is " + fact);
                break;

                case 2:
                    for(int i=1;i<=n;i++){
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                default:
                    System.out.println("Please Enter the correct option");
            }
            System.out.print("Do you want to continue? (y/n):");
             c = s.next();
        }
        while(c.equals("y"));
    }

}

