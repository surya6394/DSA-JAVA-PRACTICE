package Recursion;

import java.util.Scanner;

public class nthFibonacciNum {

    public static int printLastNum(int n){
        if(n <= 1){
            return n;
        }
        int last = printLastNum(n-1);
        int slast = printLastNum(n-2);
        return last + slast;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(printLastNum(n));
    }
}
