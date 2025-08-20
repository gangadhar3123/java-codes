import java.util.Random;
import java.util.Scanner;

public class JavaPrac{
    public static  void main(String[] args){


        //Random random=new Random();
//int data=random.nextInt(1,6);
//System.out.printf("the Integer Random Value :  %d \n",data);
//double data2=random.nextDouble(1,4);
//System.out.printf("The Double Random Value :  %f \n",data2);
//Boolean data3=random.nextBoolean();
//System.out.printf("the Boolen Value :  %b \n",data3);



//
//
//double a  =sc.nextDouble();
//       double  sign=Math.signum(a);
//
//if (sign==1.0){
//    System.out.printf(" %f is positive number",a);
//
//}else if(sign==0.0){
//    System.out.printf("%f is zero",a);
//}else{
//    System.out.printf("%f is negative number",a);
////}

        Scanner sc=new Scanner(System.in);

//
//
//
//        System.out.print("Enter a Year : ");
//
//        Scanner sc=new Scanner(System.in);
//        int year=sc.nextInt();
//        if (year%4==0 && year%100!=0){
//            System.out.printf("%d is a leap year \n",year);
//        }
//else{
//    System.out.printf("%d is not a leap year \n",year);
//        }







//
//int a=sc.nextInt();
//int b=sc.nextInt();
//int c=sc.nextInt();
//int Gretest=0;
//if (a >b ){
//    if (c>a){
//       Gretest=c;
//    }
//    else{
//       Gretest=a;
//    }
//}
//else if(a<b){
//    if(c>b){
//      Gretest=c;
//    }
//    else{
//       Gretest=b;
//    }
//
//
//}
//
//System.out.println(Gretest);


//if(a%10==b%10){
//    System.out.println("yes ");
//}else{
//    System.out.print("no");
//}
//int por= ((a%10)==(b%10))?1:0;
//System.out.print(por);


System.out.print("enter a character : ");

char vorc=sc.next().charAt(0);

if (vorc == 'a' || vorc=='A' || vorc =='e' || vorc=='E'  || vorc=='i' || vorc=='I'  || vorc=='o' || vorc=='O' || vorc =='u' || vorc=='U' ){
    System.out.println("This is a Vowel ");
}
else{
    System.out.println("This is a Character ");
}








 }

}














//flag,precison,string-char,width,random method