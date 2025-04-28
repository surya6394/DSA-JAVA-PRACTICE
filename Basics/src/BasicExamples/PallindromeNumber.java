package BasicExamples;

import java.util.Scanner;

public class PallindromeNumber {

    public static void reverseNumber(int n, int rev){
        // n = 858
        // rev = 0 ->
        int i = n;
        while(n != 0){
            rev = rev*10 + n%10; // -> 0+8 = 8 -> 8*10+85%10 = 85 -> 85*10+8%10 = 858
            n = n / 10; // -> 858/10 = 85 -> 85/10 = 8 -> 8/10 = 0
        }

        if(i == rev){
            System.out.println("Number is Pallindrome.");
        } else{
            System.out.println("Number is not Pallindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();
        sc.close();
        int rev = 0;
        reverseNumber(n,rev);
    }

}
