import java.util.*;

class DemoNew
{
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the row and coloms:");
    int m = s.nextInt();
    int n = s.nextInt();
    System.out.println("Enter the row and colum for second matrix:");
    int q = s.nextInt();
    int r = s.nextInt();
    int first[][] = new int[20][20];
    System.out.println("Enter the element in matrix");
    for (int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            first[i][j]= s.nextInt();
        }
    }
    System.out.println("---------------Dispaly matrix 1------------------");
    for (int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            System.out.print(first[i][j]+"\t");
        }
        System.out.print("\n");
    }

    int second[][]= new int[20][20];
    System.out.println("Enter the element in second matrix:");
    for(int k=1;k<=q;k++){
        for(int l=1;l<=r;l++){
            second[k][l]=s.nextInt();
        }
    }

    System.out.println("-------------Display second matrix------------------");
    for(int k=1;k<=q;k++){
        for(int l=1;l<=r;l++){
            System.out.print(second[k][l]+ "\t");
        }
        System.out.print("\n");
    }

    int sum;
    int multi[][] = new int[20][20];
    System.out.println("Storing multiplication in matrix");
    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            sum=0;
            for(int k=1;k<=q;k++){
                sum = sum + (first[i][k]*second[k][j]);
            }
        multi[i][j] = sum;
        
        }
    }

    System.out.println("--------------------display Multiplication matrix----------------");
    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            System.out.print(multi[i][j]+"\t");
        }
        System.out.print("\n");
    }
    

    }

}