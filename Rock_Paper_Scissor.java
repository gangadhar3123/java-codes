import java.util.*;

public class Rock_Paper_Scissor {
    public static void main(String [ ] args){
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter your num : ");
//        double usernum=sc.nextDouble();
        double randnum=Math.random();
        if (randnum <=0.5 ){
            System.out.println("this is head");
        }else{
            System.out.println("this is toss");
        }

    }
}
