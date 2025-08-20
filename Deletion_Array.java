import java.util.Scanner;

public class Deletion_Array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size For an Array : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<=a.length-1;i++){
            System.out.println("Enter An Element to Insert : ");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=a.length-1;i++){
            System.out.println("The Inseeted Elements : "+a[i]);
        }
        System.out.println("*******************************");
        System.out.println("1. Delete At The Begining.");
        System.out.println("2. Delete At The Middle.");
        System.out.println("3. Delete At The End");
        System.out.println("*******************************");

        System.out.print("Enter Your Option : ");
        int option=sc.nextInt();
        switch (option){
            case 1:{
                System.out.println("Deleting At the Begining .");

                for (int i=0;i<=a.length-2;i++){
                    a[i]=a[i+1];
                }
                a[a.length-1]=0;
                for(int j=0;j<=a.length-1;j++){
                    System.out.println("The Array Elemnats : "+a[j]);
                }

                break;
            }

            case 2:{
                System.out.print("Enter Your Index Value : ");
                int index=sc.nextInt();
                System.out.println("Delete At the Middle .");
                for (int i=index;i<= a.length-2;i++){
                    a[i]=a[i+1];
                }
                a[a.length-1]=0;
                for(int j=0;j<=a.length-1;j++){
                    System.out.println("The Array Elemnats : "+a[j]);
                }
                break;
            }
            case 3:{

                System.out.println("Delete At the Ending .");
                a[a.length-1]=0;
                for(int j=0;j<=a.length-1;j++){
                    System.out.println("The Array Elemnats : "+a[j]);
                }
                break;

            }
        }
    }
}
