import java.util.Scanner;

public class AnyPostion_Array {
    public  static void main(String []args){
        int a[]={1,2,3,4,5};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Index Value : ");
        int index=sc.nextInt();
        System.out.println("Enter Your Value : ");
        int value=sc.nextInt();
        for(int i=a.length-1;i>index;i--){
            a[i]=a[i-1];

        }
        a[index]=value;
        for(int j=0;j<=a.length-1;j++){
            System.out.println("The value at "+j+" is :"+a[j]);
        }

    }
}
