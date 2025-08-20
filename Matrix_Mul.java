import java.util.Scanner;

public class Matrix_Mul {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Size : ");
        int row=sc.nextInt();
        System.out.println("Enter Column Size : ");
        int column=sc.nextInt();
        int twod_arr[][]=new int[row][column];
        int result_matrix[][]=new int[row][column];
        System.out.println("Enter Your values for 1st matrix: ");
        for(int i=0;i<=row-1;i++){
            for(int j=0;j<=column-1;j++){
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
        for(int i=0;i<=row1-1;i++){
            for(int j=0;j<=column-1;j++){
                System.out.println("Enter Your Element : ");
                int in=sc.nextInt();
                twod_arr2[i][j]=in;

            }
        }


        System.out.println("***************************");
        System.out.println(" Matrix Multiplication :  ");
        System.out.println("The 2-D Array is : ");

        for(int i=0;i<=row-1;i++){
            for(int j=0;j<=column-1;j++){
                result_matrix[i][j]=0;
for(int k=0;k<=row-1;k++) {

    result_matrix[i][j]+= twod_arr[i][k] * twod_arr2[k][j];
}

            }

        }
        for(int i=0;i<=row1-1;i++){

            for(int j=0;j<=column-1;j++) {
                System.out.print(result_matrix[i][j]+" ");
            }
System.out.println(" ");
        }


    }

}
