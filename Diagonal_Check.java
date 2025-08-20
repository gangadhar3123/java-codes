import java.util.Scanner;

public class Diagonal_Check {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Size : ");
        int row=sc.nextInt();
        System.out.println("Enter Column Size : ");
        int column=sc.nextInt();
        int twod_arr[][]=new int[row][column];
        int result_matrix[][]=new int[column][row];
        System.out.println("Enter Your values for 1st matrix: ");
        for(int i=0;i<=row-1;i++){
            for(int j=0;j<=column-1;j++){
                System.out.println("Enter Your Element : ");
                int in=sc.nextInt();
                twod_arr[i][j]=in;
            }



        }
                for ( int i = 0; i <row; i++) {
                    for (int j = 0; j < column ; j++) {
                        if (i == j || j == column - i-1) {
                            if (twod_arr[i][j] % 2 != 0) {
                                twod_arr[i][j] += 1;

                            } else {
                               continue;
                            }
                        }

                        System.out.print(twod_arr[i][j] + " ");

                    }

                    System.out.println(" ");
                }
       }
}


