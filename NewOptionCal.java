import java.util.Scanner;

public class NewOptionCal {
    public static  void main(String[] args){

        Scanner sc=new Scanner(System.in);
boolean istreue=true;
while(istreue){
    System.out.print("Enter Your First Num : ");
    int first=sc.nextInt();

    System.out.print("Enter Your Second Num : ");
    int second=sc.nextInt();


    System.out.println("1. Adiiton : a+b");
        System.out.println("2. sub : a-b");
        System.out.println("3. mul : a*b");
        System.out.println("4. div : a+/b");
        System.out.println("5. moduus : a+=%b");
        System.out.println("6. max : a,b");
        System.out.println("7. min : a,b ");
        System.out.println("8. quit \n");

        System.out.print("Enter Your option : \n");
        int option=sc.nextInt();



    switch (option) {

            case 1 :{ System.out.println("The Addition of Two Numbers : \n" + add(first, second));
            break;}


            case 2 :{ System.out.println("The Substraction of Two Numbers : \n" + sub(first, second));
            break;}

            case 3 :{ System.out.println("The Multiplication of Two Numbers : \n" + mul(first, second));
                break;}

            case 4 :{ System.out.println("The Division of Two Numbers : \n" + div(first, second));
             break;}

            case 5 :{ System.out.println("The Modulas of Two Numbers : \n" + modulus(first, second));
            break;}
            case 6 :{System.out.println("The Greater Number  of Two Numbers : \n" + max(first, second));
            break;}

            case 7 :{ System.out.println("The Smaller Number  of Two Numbers : \n" + min(first, second));
            break;}

            case 8 : {
                System.out.println("8.You ant to quit(y/n)");
                char newc = sc.next().charAt(0);
                if (newc != 'y') {
                    break;
                }
                istreue=false;
            }
        }
    }}

    static  int add(int a ,int b){
        return (a+b);
    }
    static  int sub(int a ,int b){
        return (a-b);
    }

    static  int mul(int a ,int b){
        return (a*b);
    }
    static  int div(int a ,int b){
        return (a/b);
    }
    static  int modulus(int a ,int b){
        return (a%b);
    }
    static  int max(int a ,int b){
        return (Math.max(a,b));
    }
    static  int min(int a ,int b){
        return (Math.min(a,b));
    }




}
