package Function;

import java.util.Scanner;

public class PassByValue {
    public static int addNumber(int a, int b){
        int c = a + b;
        System.out.println("Addition of the numbers- "+c);
        return c;
    }
    public static int substractNumber(int a, int b){
        int c = a - b;
        System.out.println("Substraction of two number- "+c);
        return c;
    }

    public static int compoundNumber(int a, int b){
        int c = a * b;
        System.out.println("Compound of given values- "+c);
        return c;
    }

    public static int divisionNumber(int a, int b){
        int c = a / b;
        System.out.println("Compound of given values- "+c);
        return c;
    }
    public static void main(String[] args){
        Scanner a1 = new Scanner(System.in);
        Scanner b1 = new Scanner(System.in);
        int x = a1.nextInt();
        int y = b1.nextInt();
        addNumber(x, y);
        substractNumber(x, y);
        compoundNumber(x, y);
        divisionNumber(x, y);
    }
}
