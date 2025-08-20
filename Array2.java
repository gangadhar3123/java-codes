import java.util.Scanner;

public class Array2 {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size1;
        int size2;
        System.out.print("Enter YOur Size for arrays : ");
        size1= sc.nextInt();
        System.out.print("Enter YOur Size for arrays : ");
        size2= sc.nextInt();
        int a[]=new int[size1];
        int b[]=new int[size2];

        System.out.println("Enter YOur input for first array ");
        for (int i=0;i<=a.length-1;i++){
            System.out.print("Enter elemet for Array of index "+i+" value : ");
            a[i]=sc.nextInt();

        }
        System.out.println("Enter YOur input for second array ");
        for (int j=0;j<=a.length-1;j++){
            System.out.print("Enter elemet for Array of index "+j+" value : ");
            b[j]=sc.nextInt();

        }
int sum[]=new int[Math.max(size1,size2)];

        System.out.println("the sum of Two Array Elements..");
        for(int k=0;k<=sum.length-1;k++){
            int val=(k<size1)?a[k]:0;
            int val2=(k<size2)?b[k]:0;
            sum[k]=val+val2;
            System.out.println("At index "+k+" the sum is : "+sum[k]);

        }
    }
}
// do this for that if s1=3 and s2=4 we have to want also the s2 of 4 elemnt as sum