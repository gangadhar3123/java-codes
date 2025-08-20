import java.util.Scanner;

public class Freq {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size For an Array : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<=a.length-1;i++){
            System.out.print("Enter An Element to Insert : ");
            a[i]=sc.nextInt();
        }
//        int a[]={1,3,43,2,3,4,3,6} ;
        int count=-1;
        int index=0;
        int max_freq=0;

        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=a.length-1;j++){
                if(a[i]==a[j]){
                    count+=1;

                if(max_freq<count){
                    max_freq=count;
                    index=i;
                }}
              }
            count=0;

        }
        System.out.println("The Max Frequency is : "+max_freq);
        System.out.println("The Max Frequency Element is :"+a[index]);

    }
}
