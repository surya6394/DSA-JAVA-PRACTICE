package Recursion;

import java.util.Scanner;

public class FunctionalRecursion {

    // Sum of first N number
    public static int addNumbers(int n){
        if(n == 0) {
            return 0;
        }
        return n+addNumbers(n-1);
    }

    // Factorial of the given number
    public static int factorialNumber(int n){
        if(n == 1){
            return 1;
        }
        return n*factorialNumber(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of value = ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Sum of first N numbers = "+addNumbers(n));

        System.out.println("Factorial of the given number = "+factorialNumber(n));

    }
}
