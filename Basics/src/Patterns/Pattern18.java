package Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i = 1; i <= n; i++){
            char ch = (char)((int)'A' + n - 1);
            for(int j = 0; j < i; j++){
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }
}
