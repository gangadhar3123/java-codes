import javax.sound.midi.SysexMessage;
import java.util.*;
public class Do_While {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);


//        do{
//            System.out.println(i);
//            i+=1;
//
//        }
//        while(i<=5);{
//            System.out.println("Yes this is less than 6 ");
//        }
//        int i=0;
//        for( i=0;i<=5;i++);
//        System.out.println(i);


//
//        int i=0;
//        int a=0;
//
//      do{
//
//          i+=2;
//          System.out.println(i);
//          a+=1;
//      }while(a<userinput);

//
//
//        double total=0;
//        int userinput=0;
//        do{
//            System.out.print("Enter any Number : ");
//               userinput=sc.nextInt();
//               total+=userinput;
//                System.out.println("Your sum is : "+total);
//
//        }while(Math.signum(userinput)==1 );{
////            total+=Math.abs(userinput);
////            System.out.println("Your sum is : "+total);
//            System.out.println("you enterd the Negative Number !!! ");
//        }
//

        int chances=0;
        int hiddennum=15;
        int userinput=0;
        do{
            System.out.print("Enter your Guess Num : ");
            userinput=sc.nextInt();

            chances+=1;

            if(userinput!=hiddennum){
                if(userinput-hiddennum >5){

                    System.out.println("Your Guess is Too High to Target . Try again !!");
                }else if(userinput-hiddennum < -5){
                    System.out.println("Your Guess is Too Low to Target . Try again !!");
                }else{
                    System.out.println("Your Guess is Near to Target. Try again !!");
                }

            }else{
                System.out.println("Great,You Did it Man !!");
                break;
            }

        }while( chances <= 7 );{

                if(chances > 7){
                System.out.println("Over 7 chances !!! ");}

        }




    }
}
