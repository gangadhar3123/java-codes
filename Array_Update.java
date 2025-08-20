import java.util.Scanner;

public class Array_Update {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int array_elements[]={1,2,3,4,5};

        for(int j=0;j<=array_elements.length-1;j++){
            System.out.printf("the element of index %d of elemrnt : %d \n",j,array_elements[j]);
        }

        System.out.println("Enter Position to Update.");
        int index=sc.nextInt();
        System.out.println("Enter The Value to Update.");
        int value=sc.nextInt();

        array_elements[index]=array_elements[value];

        for(int j=0;j<=array_elements.length-1;j++){
            System.out.println("The values after upation "+j+" is :"+array_elements[j]);
        }

    }
}
