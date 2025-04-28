package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Print name n times
public class PrintName {

    // Method - 1
//    public static void MyName(int i,int n){
//        if(i > n) return;
//        System.out.println(i+". "+"My name is Surya.");
//        MyName(i+1,n);
//    }
//
//    public static void main(String[] args) {
//
//        int i = 1;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of times you want to print");
//        int n = sc.nextInt();
//        sc.close();
//        MyName(i, n);
//    };


    // Method - 2

    public static List<String> printList(int n){
        List<String> result = new ArrayList<>();
        printName(n, result);
        return result;
    }

    private static void printName(int n, List<String> result){
        if(n == 0){
            return;
        }
        result.add("Surya Pratap, ");
        printName(n-1, result);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of time you want to print your name = ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(printList(n));
    }

}
