import java.util.Scanner;

public class Array3 {
    public  static  void main(String[] args){

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
        System.out.println("1. Insert At The Begining.");
        System.out.println("2. Insert At The Middle.");
        System.out.println("3. Insert At The End");
        System.out.println("*******************************");

        System.out.print("Enter Your Option : ");
        int option=sc.nextInt();
        System.out.print("Enter Your Value : ");
        int value=sc.nextInt();
        switch (option){
            case 1:{
                    System.out.println("inseriting At the Begining .");

            for (int i=a.length-1;i>=1;i--){
                a[i]=a[i-1];
            }
            a[0]=value;
            for(int j=0;j<=a.length-1;j++){
                System.out.println("The Array Elemnats : "+a[j]);
            }

            break;
                }

                case 2:{
                    System.out.print("Enter Your Index Value : ");
                    int index=sc.nextInt();
                            System.out.println("inseriton At the Middle .");
            for (int i=a.length-1;i>=index;i--){
                a[i]=a[i-1];
            }
            a[index]=value;
            for(int j=0;j<=a.length-1;j++){
                System.out.println("The Array Elemnats : "+a[j]);
            }
            break;
                }
                case 3:{

            System.out.println("inseriton At the Ending .");
            for (int i=0;i<=a.length-2;i++){
                a[i]=a[i+1];
            }
            a[a.length-1]=value;
            for(int j=0;j<=a.length-1;j++){
                System.out.println("The Array Elemnats : "+a[j]);
            }
            break;

                }
            }
        }
    }

