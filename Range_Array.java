import java.util.Scanner;

public class Range_Array {
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Array Size : ");
        int size=sc.nextInt();
        System.out.print("Enter The Min Range : ");
        int min_range=sc.nextInt();
        System.out.print("Enter The Max Range : ");
        int max_range=sc.nextInt();
        int Array[]=new int[size];
        for(int i=0;i<=size-1;i++){
            System.out.print("Enter Your Array Element: ");
            int user_input=sc.nextInt();
            if(user_input> max_range || user_input<min_range){
                System.out.println("Your input value is Not in Specified Rnage !!");
                break;
            }else{
                Array[i]=user_input;
            }
        }
        int max_element;
        int min_element;
        int max=0;
        int min=Array[0];
        for(int j=0;j<=size-1;j++){
            for(int i=0;i<=size-1;i++){
                 max_element=Math.max(Array[i],Array[j]);
                 if(max_element > max){
                     max=max_element;
                 }
                min_element=Math.min(Array[i],Array[j]);
                 if(min_element < min){
                     min=min_element;

                 }

            }
        }
        System.out.println("The Max Element : "+max);
        System.out.println("The Min Element : "+min);
        int total=max-min;

        System.out.println("The Range B/w Max and Min of Array Elements : "+total);
    }
}
