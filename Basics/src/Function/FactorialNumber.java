package Function;

import java.util.Scanner;

public class FactorialNumber {

    public static void findFactorial(int n){
        if(n <= 0){
            System.out.println("Alert! Given Number is Invalid.");
            return;
        }
        int fact = 1;
        for(int i = n; i >= 1; i--){
            fact = fact * i;
        }
        System.out.println("Factorial of the given number is - "+fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findFactorial(n);
    }
}
