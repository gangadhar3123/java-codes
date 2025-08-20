import java.util.*;
public class Tempature_MOR {
    static double Celicus;
    static int Farenheat;
    static int option;
    static double c;
    static Scanner sc = new Scanner(System.in);

    static double Change(double a) {
        return ((a * 9 / 5) + 32);
    }

    static double Change(int b) {
        c = b;
        return (5.0 / 9.0 * (c - 32));
    }

    public static void main(String[] args) {
        System.out.println("1. You Want To Change Celcius to Farenheat .");
        System.out.println("2. You Want To Change Farenhet to Celcius .");
        System.out.println("Enter Your Option : ");
        option = sc.nextInt();

        if (option == 1) {
            System.out.print("Enter The Celcius Value : ");
            Celicus = sc.nextDouble();
            System.out.printf("After Converting %.1f to Farenheat Value is:  %.1f \n", Celicus, Change(Celicus));
        } else if (option == 2) {
            System.out.print("Enter The Farenheat  Value : ");
            Farenheat = sc.nextInt();
            System.out.printf("After Converting %d to Farenheat Value is : %.1f \n", Farenheat, Change(Farenheat));
        } else {
            System.out.println("You Entered Wrong Option !!");
        }
    }
}
