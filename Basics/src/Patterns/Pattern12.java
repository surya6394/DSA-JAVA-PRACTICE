package Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i = n; i > 0; i--){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j);
            }
            for(int j = 1; j<2*i-1; j++){
                System.out.print(" ");
            }
            for(int j = n-i+1; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
