package Recursion;

import java.util.Scanner;

public class ParameterizedRecursion {

    // Sum of first N numbers

    public static void sumOfNumbers(int sum, int n){
        if (n == 0){
            System.out.println(sum);
            return;
        }
        sumOfNumbers(sum+n, n-1);
    }

    // Factorial of the given number

    public static void factorialOfNumber(int n, int fact){
        if(n == 1){
            System.out.println(fact);
            return;
        }
        factorialOfNumber(n-1, fact*n);
    }

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num = ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Sum of first N numbers = ");
        sumOfNumbers(sum, n);

        int fact = 1;
        System.out.println("Factorial of the given number = ");
        factorialOfNumber(n,fact);
    }

}
