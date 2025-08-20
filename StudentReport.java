import java.util.Scanner;

public class StudentReport {
    public static  void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String StudentName=sc.nextLine();
        System.out.print("Enter your Class Name : ");
        String ClassName =sc.nextLine();
        System.out.print("Enter Your Age : ");
        int Age=sc.nextInt();
        System.out.print("Enter Your Sub-1 Marks Out of (100) : ");
        double sub1=sc.nextDouble();
        System.out.print("Enter Your Sub-2 Marks Out of (100) : ");
        double sub2=sc.nextDouble();
        System.out.print("Enter Your Sub-3 Marks Out of (100) : ");
        double sub3=sc.nextDouble();


        System.out.println("THe Student Name is : "+StudentName);
        System.out.println("THe Student ClassName is : "+ClassName);
        System.out.println("THe Student Age is : "+Age);
        System.out.println("The Student 3-Sub Marks :"+"Sub-1 : "+ sub1+", sub-2 : "+ sub2 +",  Sub-3 : "+ sub3);


        double Total=(sub1+sub2+sub3);
        System.out.println("Total Makrs(out of 300) : " + Total);
        double Average=(sub1+sub2+sub3)/3;
        System.out.println("Average Marks : " + Average);
        double Percentage=(Total/300)*100;
        int Percen=(int)Percentage;
        System.out.println("The Percentage : "+Percen+ " %");
        String PassorFail= (Percen <= 40)?"Fail":"Pass";
        System.out.println("The Student is :" +PassorFail);


    }
}
