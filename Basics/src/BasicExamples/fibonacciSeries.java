package BasicExamples;

import java.util.Scanner;

public class fibonacciSeries {

    public static void prinfSeries(int n){
        int first = 0, second = 1;
        int lastNum;
        if(n <= 1){
            System.out.println(n);
        }
        for(int i = 0; i < n; i++){
            System.out.println(first);
            lastNum = first + second;
            first = second;
            second = lastNum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of number = ");
        int n = sc.nextInt();
        sc.close();
        prinfSeries(n);
    }
}
