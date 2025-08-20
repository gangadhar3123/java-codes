
import java.util.*;
public class password {
static Scanner sc=new Scanner(System.in);
        static String Password="Kiran@12#1";
    //    static int  total;
        static boolean total;
        static String newpass;
        static boolean Checkup(String USerinput){
        total=USerinput.equals(Password);
        return total;
    }
    public static  void main(String[] args){

        System.out.print("Enter Your Password : ");
        newpass=sc.nextLine();
        Checkup(newpass);
        if(total){
            System.out.println("Your Login is Susccesfull !!");
        }else{
            System.out.println("Your Password is Incorrect Try Agian !!");
        }

    }
}
