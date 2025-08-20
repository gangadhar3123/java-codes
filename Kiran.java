import java.util.*;
public class Kiran{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        try {
            while(true){
            System.out.print("Enter The Number : ");
            int num = sc.nextInt();
            int reversed = 0;
            while (num != 0) {
                int dnum = num % 10;
                reversed = reversed * 10 + dnum;
                num /= 10;
            }
            System.out.println("The Reversed Number :" + reversed);
            System.out.print("You Want to Give Input Again (y/n) : ");
            char again=sc.next().charAt(0);
            if (again =='n'){
                break;
                }
            }
        } catch (Exception e) {
            System.out.println("Enter only Integers !!!!!!!!!");
        }
        finally {
            double randnu=Math.random();
            System.out.println("The Random Number : "+randnu);
        }

    }
}