import java.util.*;
public class Area {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the dollors $ : ");
////        double radius=sc.nextDouble();
////        double area=Math.PI*Math.pow(radius,2);
////        System.out.println("the radius  :"+area);

//        double dollor=sc.nextDouble();
//        double total=dollor*87;
//        System.out.println("the total Ruppers In INR : "+total);


//        System.out.print("Enter the Base :");
//        int base=sc.nextInt();
//
//        System.out.print("Enter the Power :");
//        int power=sc.nextInt();
//        double total=Math.pow(base,power);
//        System.out.println("the power valuees : "+total);


//        System.out.print("Enter the Temparature in Celcius : ");
//                double celcilus=sc.nextDouble();
//                double Faren=((celcilus*9)/5)+32;
//                System.out.println("The Farenheat Value : "+Faren);

        System.out.print("Total amount of Bill : ");

        double totalbill=sc.nextDouble();
        System.out.print("enter the number of persons : ");
        int person=sc.nextInt();
        double perperson=Math.round(totalbill/person);
        int perpo=(int)perperson;
        double remain=totalbill%person;
        int remainamo=(int)remain;
        System.out.println("the amount per persion : "+perpo + " Rupees ");
        System.out.println("the reamin amount : "+remainamo +  " Rupees ");



    }
}






