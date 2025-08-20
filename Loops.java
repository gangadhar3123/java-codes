import java.util.*;
public class Loops {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter YIur input: ");
        int UserInput=sc.nextInt();
        int i=0;

        for (i=0;i<=UserInput;i++){
            if(i%2==0){
                System.out.println("thi is even num"+i);
            }

        }
    }
}
