import java.util.Scanner;
public class Calculator {
    public static  void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Your First Num : ");
        int first=sc.nextInt();

        System.out.print("Enter Your Second Num : ");
        int second=sc.nextInt();


        Calcu(first,second);
    }

    static void Calcu(int a ,int b){

        System.out.println("The Addition of Two Numbers : "+(a+b));
        System.out.println("The Substraction of Two Numbers : "+(a-b));
        System.out.println("The Multiplication of Two Numbers : "+(a*b));
        System.out.println("The Division of Two Numbers : "+(a/b));
        System.out.println("The Modulas of Two Numbers : "+(a%b));
        System.out.println("The Greater Number  of Two Numbers : "+Math.max(a,b));
        System.out.println("The Smaller Number  of Two Numbers : "+Math.min(a,b));


    }
}
