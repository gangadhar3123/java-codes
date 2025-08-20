import java.util.*;
public class Newclass {
    public  static  void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Age :");
        int age=sc.nextInt();
        // one year == 12 months
        int months=12;
        int totalmonths=age*months;
        System.out.println("Its almost "+totalmonths+ " months Your Borned");
    }
}
