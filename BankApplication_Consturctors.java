import java.util.Scanner;
import java.util.stream.Stream;

public class BankApplication_Consturctors {
    String Applicant_Name;
    char Gender;
    int Age;
    static Scanner sc=new Scanner(System.in);
    double Balance;

    static  String Bank_Name="SBI";
    static String Branch_Name="Badvel";
    BankApplication_Consturctors(String s,char c,int i,double o){
      Applicant_Name=s;
      Gender=c;
      Age=i;
      Balance=o;
    }

    void Display(){
        System.out.println("The Applicant Name : "+Applicant_Name);
        System.out.println("Applicant Gender : "+Gender);
        System.out.println("Applicant Age : "+Age);
        System.out.println("Bank Name : "+Bank_Name);
        System.out.println("Branch Name : "+Branch_Name);
    }
    public static  void main(String [] args){

        boolean istreue=true;
        System.out.print("Enter Your Name : ");
        String applicant_name=sc.nextLine();
        System.out.print("Enter Your Gender : ");
        char gender=sc.next().charAt(0);
        System.out.print("Enter Your Age : ");
        int age=sc.nextInt();
        System.out.print("Enter Your Balance : ");
        double bala=sc.nextDouble();

        BankApplication_Consturctors bc=new BankApplication_Consturctors(applicant_name,gender,age,bala);


        while (istreue){
            System.out.println("*********************************");
        System.out.println("1. Depsoit Money");
        System.out.println("2. Debit Money");
        System.out.println("3. Balance");
        System.out.println("4.Applicant Details ");
        System.out.println("5. Quit ? ");
            System.out.println("*********************************");
        System.out.print("Enter Your Option : ");
        int option=sc.nextInt();
        switch (option){
            case 1:{
                System.out.print("Enter Money to Credit :");
                int moeny=sc.nextInt();
                bala+=moeny;
                System.out.println("After Credited Your Bank Balance :"+bala);
                break;
            }
            case 2 : {
                System.out.print("Enter Money to Debit :  ");
                int moeny=sc.nextInt();
                if(bala > moeny){
                bala-=moeny;
                }
                else {
                    System.out.println("You Doesnt have Enough Money to Debit !!");
                    break;
                }
                System.out.println("After Debited Your Bank Balance :"+bala);
                break;
            }
            case 3:{
                System.out.println("your Bank-Balance : "+bala);
                break;
            }
            case 4:{
                System.out.println("********Appicant Details ********");
                bc.Display();

                break;
            }
            case 5:{
                System.out.println("Your are Existing !!!");
                istreue=false;
            }

        }



    }

}}
