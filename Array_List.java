import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_List {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        boolean istrue=true;
        while(istrue){
            System.out.println("Enter Element into Array : ");
            String s=sc.nextLine();
            arr.add(s);
            sc.nextLine();
            System.out.println("If You Want to Stop Inserting : ");
            char c=sc.next().charAt(0);

            if(c!='n'){
                Collections.sort(arr);
                System.out.println("The Array Sorted List is : "+arr);
                istrue=false;
            }

        }

        }


    }
