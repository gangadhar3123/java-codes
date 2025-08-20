import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Array_Search {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> sarr=new ArrayList<>();
        boolean istreu=true;
        while(istreu){
        System.out.println("Enter an Element to Insert : ");
        String s=sc.next();
        if(sarr.contains(s)){
            System.out.println("This Element Already in The list !! ");
            continue;
        }else{
            sarr.add(s);
        }
        System.out.println("You want to Quit : ");
        char c=sc.next().charAt(0);
        if(c=='y'){
            Collections.sort(sarr);
            System.out.println("Your Sorted Array : "+sarr);
            istreu=false;
        }


        }
        System.out.println("Enter an Elemnt to Search");
        String search=sc.next();
        System.out.println("The Element is Found at Index : "+sarr.indexOf(search));

    }
}
