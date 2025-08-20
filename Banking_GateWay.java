import java.util.Scanner;

abstract  class Bank{
    double Amount;
    double taxrate;
    Bank(double amount,double tax){
       Amount=amount;
       taxrate=tax;
    }
    abstract void  calculate();
    abstract  void display();
}

class UPI extends Bank{
    double upi_amount;
    double tax_amount;
    UPI(double amount,double tax){
        super(amount,tax);


    }
    @Override
    void calculate() {
        tax_amount=Amount*taxrate;
         upi_amount=tax_amount+Amount;
    }
    @Override
    void display(){
        System.out.printf("The  total tax %.2f for upi_amount amount is : %.2f \n",tax_amount,upi_amount);
    }
}
class CREDDIT_CARD extends Bank{
   double  credit_amount;
    double tax_amount;
    CREDDIT_CARD(double amount,double tax){
        super(amount,tax);

    }  @Override
    void calculate() {
         tax_amount=Amount*taxrate;
        credit_amount=tax_amount+Amount;
    }
    @Override
    void display(){
        System.out.printf("The  total tax %.2f for credit_card_amount amount is : %.2f \n",tax_amount,credit_amount);
    }



}

class Online_amount extends Bank{
    double  online_amount;
    double tax_amount;
    Online_amount(double amount,double tax){
        super(amount,tax);

    }  @Override
    void calculate() {
         tax_amount=Amount*taxrate;
        online_amount=tax_amount+Amount;
    }
    @Override
    void display(){
        System.out.printf("The  total tax %.2f for online_amount amount is : %.2f \n",tax_amount,online_amount);
    }

}
public class Banking_GateWay {
    public  static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1. UPI AMOUNT TRANSFER. ");
        System.out.println("2. CREDIT CARD AMOUNT TRANSFER. ");
        System.out.println("3. ONLINE AMOUNT TRANSFER. ");
        try{
        System.out.println("Enter Your Option: ");
        int option=sc.nextInt();

        if(option==1 || option==2||option==3){
        switch (option){
            case 1:{
                System.out.println("Enter Amount to Trnasfer: ");
                int amount=sc.nextInt();
                UPI up=new UPI(amount,0.10);
                up.calculate();
                up.display();
                break;
            }
            case 2:{
                System.out.println("Enter Amount to Trnasfer: ");
                int amount=sc.nextInt();
                CREDDIT_CARD up=new CREDDIT_CARD(amount,0.15);
                up.calculate();
                up.display();
                break;
            }
            case 3:{

                System.out.println("Enter Amount to Trnasfer: ");
                int amount=sc.nextInt();
                Online_amount up=new Online_amount(amount,0.5);
                up.calculate();
                up.display();
                break;
            }

        }
        }else{
            throw new RuntimeException("You entered invalid input");

        }
        } catch (Exception e) {
            System.out.println("You Entered Wrong Input.!!!");
            System.out.println(e);
        }


    }
}
