import java.util.Arrays;
import java.util.Scanner;

public class TwoD_Array {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Size : ");
        int row=sc.nextInt();
        System.out.println("Enter Column Size : ");
        int column=sc.nextInt();
        int twod_arr[][]=new int[row][column];
        System.out.println("Enter Your values for 1st matrix: ");
        for(int i=0;i<=column-1;i++){
            for(int j=0;j<=row-1;j++){
                System.out.println("Enter Your Element : ");
                int in=sc.nextInt();
                twod_arr[i][j]=in;
            }
        }
System.out.println("***************************");
        System.out.println("Enter Row Size : ");
        int row1=sc.nextInt();
        System.out.println("Enter Column Size : ");
        int column1=sc.nextInt();
        int twod_arr2[][]=new int[row1][column1];
        System.out.println("Enter Your values for 2st matrix: ");
        for(int i=0;i<=column1-1;i++){
            for(int j=0;j<=row1-1;j++){
                System.out.println("Enter Your Element : ");
                int in=sc.nextInt();
                twod_arr2[i][j]=in;
            }
        }
        System.out.println("***************************");
        System.out.println(" ");
System.out.println("The 2-D Array is : ");
        for(int i=0;i<=column-1;i++){
            for(int j=0;j<=row-1;j++){
                System.out.print((twod_arr[i][j]+twod_arr2[i][j])+" ");

            }
            System.out.println("  ");
        }



    }
}

