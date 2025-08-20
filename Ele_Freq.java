import java.util.Scanner;

public class Ele_Freq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size For an Array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("Enter An Element to Insert : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("The Inseeted Elements : ");
        for(int i=0;i<=arr.length-1;i++){


            System.out.print(arr[i]+" ");

        }
        System.out.println(" ");
        System.out.println("Enter Target Element to Found : ");

        int target=sc.nextInt();
        int freq=0;
        int last=0;

        for (int i=0;i<=arr.length-1;i++){
            if(arr[i]==target){freq+=1;
                if(freq==1){System.out.println("The first Ocuurance Found at : "+i);}
            }
            last=i;
        }
        System.out.println("The lastt Ocuurance Found at : "+last);

        System.out.println("The Frequency of Target is : "+freq);
        }}
