import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class Array_List_Search {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(3);
        arr.add(4);
        arr.add(6);
        arr.add(55);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);


    }
}
