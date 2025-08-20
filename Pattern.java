import java.util.*;
public class Pattern {

    static int option;
    static int i;
    static int j;
    static int num1;
    static  int num2;
    static  Scanner sc=new Scanner(System .in);
    static  void  Patterns(int a){
        for (i=1;i<=a;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println( );
        }
    }
    static void Patterns(int a ,int b){
        for(i=1;i<=a;i++){
            for(j=1;j<=b;j++){
                System.out.print(j+" ");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args ){
        System.out.println("1. for Tri");
        System.out.println("2. for Square");
        System.out.print("Enter Your Option : ");
        option=sc.nextInt();
        if(option==1){
            System.out.print("Enetr Your Num : ");
            num1=sc.nextInt();
            Patterns(num1);
        }
        else if(option==2){
            System.out.print("Enter Your 1-Num : ");
            num1=sc.nextInt();
            System.out.print("Enter Your 2-Num : ");
            num2=sc.nextInt();
            Patterns(num1,num2);

        }
    }

}
