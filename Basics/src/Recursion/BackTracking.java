package Recursion;

import java.util.Scanner;

public class BackTracking {

    // Print 1 to N without using i + 1
    public static void print1toN(int i, int n){

        if(i < 1) return;
        print1toN(i - 1, n);
        System.out.println(i);

    }

    // Print N to 1 without using i - 1
    public static void printNto1(int i, int n){

        if (i > n) return;
        printNto1(i+1,n);
        System.out.println(i);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the number = ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("1 to N number printed : ");
        print1toN(n,n);
        System.out.println("N to 1 number printed : ");
        printNto1(1,n);

    }
}
