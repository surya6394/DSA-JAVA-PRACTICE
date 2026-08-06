package Basic.ThingsToKnow;

import java.util.Scanner;

public class AdditionOfTwoNumbers {

    public static int Addition(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println("Enter the value of a = ");
        Scanner x = new Scanner(System.in);
        int m = x.nextInt();
        System.out.println("Enter the value of b = ");
        Scanner y = new Scanner(System.in);
        int n = y.nextInt();

        System.out.println("Sum of a and b = "+Addition(m,n));
    }
}
