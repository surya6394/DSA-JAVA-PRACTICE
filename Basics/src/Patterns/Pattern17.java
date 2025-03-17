package Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for(char ch = 'A'; ch <= 'A'+i; ch++){
                System.out.print(ch);
            }
            char b = (char)((int) 'A'+i-1);
            for(char ch = b; ch >= 'A'; ch-- ){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
