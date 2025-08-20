

import java.util.Scanner;
public class Armstring {
    static int number;
    static int total = 0;
    static int fakenum;

    static Scanner sc = new Scanner(System.in);

    static void InputNum() {
        System.out.print("Enter Your Num: ");
        number = sc.nextInt();
        fakenum = number;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            total += Math.pow(digit, 3);
            temp /= 10;
        }

    }
    static void Cubing() {

        if (total == fakenum) {
            System.out.println(fakenum + " is an Armstrong Number!");
        } else {
            System.out.println(fakenum + " is NOT an Armstrong Number !.");
        }
    }

    public static void main(String[] args) {
        InputNum();
        Cubing();
    }
}

