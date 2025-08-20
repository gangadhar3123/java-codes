import java.util.*;
import java.lang.*;
public class Areas{
    static int option;
    static int a;
    static int b;
    static double c;
    static double d;
    static boolean isture=true;

   static Scanner sc=new Scanner(System.in);
    static double Area(int a){
        return(Math.PI*Math.pow(a,2));
    }
    static double Area(double a){
        return (Math.pow(a,2));
    }
    static double Area(double a,double b){
        return(a*b);
    }
    static  double Area(int a,int b) {
        return (0.5 * a * b);
    }
    public static void main(String[]args){
        while(isture){
        System.out.println("1. Area of Circle ");
        System.out.println("2. Area of Square ");
        System.out.println("3. Area of Rectangle ");
        System.out.println("4. Area of Triangle ");
        System.out.println("5. You Want to Quit  \n");
        System.out.print("Enter Your Option : ");
        option=sc.nextInt();

        switch (option){
            case 1:{
                System.out.print("Enter r value : ");
                a=sc.nextInt();
                System.out.printf("The are of Square : %.2f \n\n",Area(a));
                break;
            }
            case 2:{
                System.out.print("Enter s value :");
                c=sc.nextDouble();
                System.out.printf("The are of Square : %.2f \n\n",Area(c));
                break;
            }

            case 3:{
                System.out.print("Enter l value :");
                c=sc.nextDouble();
                System.out.print("Enter b value :");
                d=sc.nextDouble();
                System.out.printf("The are of Rectangle : %.2f \n\n",Area(c,d));
                break;
            }
            case 4:{
                System.out.print("Enter l value :");
                a=sc.nextInt();
                System.out.print("Enter b value :");
                b=sc.nextInt();
                System.out.printf("The are of Triangle : %.2f \n\n",Area(a,b));
                break;

            }
            case 5 : {
                System.out.println("8.You ant to quit(y/n)");
                char newc = sc.next().charAt(0);
                if (newc != 'y') {
                    System.out.println("You Are Existinggg !!!!");
                    break;
                }
                isture=false;
            }

        }

    }}
}
