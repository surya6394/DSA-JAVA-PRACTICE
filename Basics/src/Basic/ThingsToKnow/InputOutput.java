package Basic.ThingsToKnow;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("Please Enter value of a = ");
        int x = a.nextInt();
        System.out.println("Please enter the value of b = ");
        int y = b.nextInt();
        System.out.println("Value of a = "+x+"\nValue of b = "+y);
    }
}
