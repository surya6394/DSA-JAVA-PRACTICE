package BasicExamples;

import java.util.Scanner;

public class nthFibonacciNumber {

    public static int printNumber(int n){
        int firstNum = 0, secNum = 1;
        int lastNum = 0;
        if(n <= 1){
            return n;
        }
        for(int i = 0; i < n; i++){
            lastNum = firstNum + secNum;
            firstNum = secNum;
            secNum = lastNum;
        }
        return lastNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(printNumber(n));
    }
}
