import java.util.Scanner;

public class StudentConsturct {
    String  Student_Name;
    int Stduent_Roll_no;//instace ->> variables changes on time
    static int Sub_1;
    static  int Sub_2;
    static  int Sub_3; // static ->>  varibles doesnt change on time its constant
    static int total=0;
static Scanner sc=new Scanner(System.in);

    StudentConsturct(int s1,int s2,int s3){
        Sub_1=s1;
        Sub_2=s2;
        Sub_3=s3;
    }

    void Student_Inputs(){
        System.out.print("Enter Student Name : ");
        Student_Name=sc.nextLine();
        System.out.print("Enter Student  Roll_No : ");
        Stduent_Roll_no=sc.nextInt();
        System.out.print("Enter Sub_1 Marks : ");
        Sub_1=sc.nextInt();
        System.out.print("Enter Sub_2 Marks : ");
        Sub_2=sc.nextInt();
        System.out.print("Enter Sub_3 Marks : ");
        Sub_3=sc.nextInt();
    }
    void Display(){
        System.out.println("Student Marks "+" Sub_1 : "+Sub_1+" Sub_2 :" +Sub_2+"Sub_3 :"+Sub_3);
        total=Sub_1+Sub_2+Sub_3;
        System.out.println("The total Marks Out of 300 is : "+total);
    }
    void AnotherMethod(){
        if(total>150){

            System.out.println(Student_Name +" You Got Successfully Passed 😎 !!! ");

        }else{
            System.out.println("Nope "+Student_Name+" You Failed Buddy  😒!!");
        }
    }

    public static  void main(String [] args){
        StudentConsturct c=new StudentConsturct(Sub_1,Sub_2,Sub_3);
        c.Student_Inputs();
        c.Display();
        c.AnotherMethod();
    }
    }



    // seach with if no static give to that code when the instace of the class
// we dont give instace varibles to the constcters