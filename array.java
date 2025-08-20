import java.util.Scanner;

public class array {
    public  static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int array_elements[]=new int[5];
        for(int i=0;i<=array_elements.length-1;i++){
            System.out.print("Enter Your Element to Insert : ");
            array_elements[i]=sc.nextInt();
        }
        for(int j=0;j<=array_elements.length-1;j++){
            System.out.printf("the element of index %d of elemrnt : %d \n",j,array_elements[j]);
        }
        for(int k=0;k<=array_elements.length-1;k++){
            if(array_elements[k]%2==0){
                System.out.println("This is Even Number in the array at index "+k+" value "+ array_elements[k]);
            }
        }
    }
}
