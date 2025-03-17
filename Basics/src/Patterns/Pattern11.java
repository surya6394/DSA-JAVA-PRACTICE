package Patterns;

import java.util.Scanner;

public class Pattern11 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int number = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(number+" ");
                if(number == 1) number--;
                else number++;
            }
            System.out.println();
        }
    }
}
