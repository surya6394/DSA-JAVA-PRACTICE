package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Print1ToN {

    // Print 1 - N

    // Method - 1

//    public static void printNum(int i, int n){
//
//        if(i > n) return;
//        System.out.println(i);
//        printNum(i + 1, n);
//
//    }


    // Method - 2 by using ArrayList
//    public static List<Integer> printNos(int x) {
//        // Write Your Code Here
//        List<Integer> res = new ArrayList<>();
//        int i = 1;
//        printList(x, i, res);
//        return res;
//    }
//
//    public static void printList(int x, int i, List<Integer> res){
//        if(i > x){
//            return;
//        }
//        res.add(i);
//        printList(x, i+1, res);
//    }

    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] res = new int[x];
        printArray(res, 0);
        return res;
    }

    public static void printArray(int[] res, int n){
        if(n == res.length){
            return;
        }
        res[n] = n+1;
        printArray(res, n+1);
    }

//    Print N - 1
    public static void printNum2(int i, int n){
        if(i < 1) return;
        System.out.println(i);
        printNum2(i-1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N = ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Print 1 - N => \n"+printNos(n));
//        printNum(1,n);
        System.out.println("Print N - 1");
        printNum2(n,n);

    }
}
