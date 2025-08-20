import com.sun.source.tree.WhileLoopTree;

import java.util.*;
public class BankingSystem {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name=sc.nextLine();
        System.out.print("Enter Your Age : ");
        int age=sc.nextInt();
        double Bankbalance=0;
        boolean Isrun=true;
        System.out.printf("Hii %s Welcome to Bank \n",name);

       while (Isrun) {

           System.out.print("*".repeat(28)+"\n");

           System.out.println("If You Want Loan Press : 1 ");
        System.out.println("If You Want withdraw Amount Press : 2");
        System.out.println("If you want to Deposit Money Press : 3");
        System.out.println("If you want to Know Your Balance : 4");
           System.out.println("If you want to quit : 5");
           System.out.print("*".repeat(28)+"\n");

           System.out.print("Enter Your Optiion : ");
        int option=sc.nextInt();
        switch (option){
            case 1:{
                System.out.println("Note : the intrest rate is 9.1 ");
              double intrest=9.1;
                System.out.print("If you want the loan (y/n) ? : ");
                char option2=sc.next().charAt(0);
                System.out.print("Enter the Money you want : ");
                double amountmoney=sc.nextDouble();
                System.out.print("Enter How many Year You can Return: ");
                int years=sc.nextInt();
                double SimpleInterest = (amountmoney * intrest * years) / 100;
                System.out.printf("Your intrest amount for your money %.2f is %.2f \n",amountmoney,intrest);
                double totalamount=amountmoney+=SimpleInterest;
                System.out.printf("Your total Money After intrest : %.2f \n",totalamount);

                System.out.print("You want to Deposit this money to Your accunt (y/n): ");
                char gues=sc.next().charAt(0);
                if(gues!='n'){
                    System.out.println("Your loan is successfully sanctioned. !!");
                    System.out.printf("Your amount is Credited to YOur account : %.2f \n" , (Bankbalance+=totalamount-SimpleInterest));
                }else {
                    break;
                }
            }

                break;

                case 2:{
                    System.out.print("Enter amount to Debit : ");
                    double debitamount= sc.nextDouble();
                    System.out.println("You want to debit your maoney (y/n)?");

                    char gues=sc.next().charAt(0);
                    if(gues!='n' && Bankbalance >=debitamount ){
                        System.out.println("Your Amount is Successfully Debited !! ");
                        System.out.printf("Your amount is Credited to YOur account: %.2f ",(Bankbalance-=debitamount) );
                    }else{
                        System.out.println("Sorry Bro You have'nt an Insufficent amount to debit" );
                    }
                    }
                    break;


            case 3: {
                System.out.print("Enter amount to Credit : ");
                double creditamount = sc.nextDouble();
                System.out.println("You want to credit your money (y/n)?");
                char gues = sc.next().charAt(0);
                if (gues != 'n') {
                    System.out.println("Your Amount is Successfully Credited !! ");
                    System.out.println("Your amount is Credited to YOur account:  " + (Bankbalance += creditamount));
                } }

                break;

            case 4:{
                System.out.println("Your Balance Amount is :" + Bankbalance);

            }
            break;
            case 5: {
                System.out.print("You want to Quit (y/n) : ");
                char optins = sc.next().charAt(0);

                if (optins == 'n') {
                    break;
                }
                System.out.println("You are Existing Thank You !!!");
                Isrun=false;

            }

            break;

            }
       }


        }
    }

