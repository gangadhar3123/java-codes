import java.util.*;
public class StudentReportUSingMethos {

    static  String StduentName;
     static  String Branch;
       static int Rollno;
       static double Sub1;
       static double Sub2;
      static   double Sub3;
      static double  total;
      static double average;
      static  double Percentage;
static Scanner sc=new Scanner(System.in);
    static void Inputs(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        StduentName=sc.nextLine();
        System.out.print("Enter Student Branch : ");
        Branch=sc.nextLine();
        System.out.print("Enter Your RollNo :");
        Rollno= sc.nextInt();
        System.out.print("Enter Your Sub-1 Marks :");
        Sub1=sc.nextDouble();
        System.out.print("Enter Your Sub-2 Marks :");
        Sub2=sc.nextDouble();
        System.out.print("Enter Your Sub-3 Marks :");
        Sub3=sc.nextDouble();
        sc.nextLine();
        System.out.println("*".repeat(20));
    }
    static  void Calculation() {

        total = Sub1 + Sub2 + Sub3;

        average = total / 3;

        Percentage = (total / 300) * 100;

    }
    static void Display(){
        System.out.println("Student Name is : "+StduentName);
        System.out.println("Student Branch is : "+Branch);
        System.out.println("Student Roll NO is  : "+Rollno);
        System.out.println("*".repeat(20));
        System.out.printf("The Total Marks Obtained Out of(300) is : %.2f \n" , total);
        System.out.printf("The Average Marks Per Sub : %.2f \n" , average);
        System.out.printf("The Percentage of The Student is :  %.2f %s\n" , Percentage,"%");

        if (Percentage < 45) {
            System.out.println("Student Failed !! ");
        } else if (Percentage <= 75 && Percentage >= 45) {

            System.out.println("Student Secured B Grade !! ");

        } else if (Percentage >= 75 && Percentage <= 90) {
            System.out.print("Student Secured A Grade !!");
        } else {
            System.out.println("Stduent Secured S Grade !!");
        }


    }

    public static  void main(String[] args){
        Inputs();
        Display();
    }



}
