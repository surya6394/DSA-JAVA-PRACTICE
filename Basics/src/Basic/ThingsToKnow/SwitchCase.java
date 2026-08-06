package Basic.ThingsToKnow;

import java.util.Scanner;

public class SwitchCase {
    /*
Take the day no and print the corresponding day
for 1 print Monday,
for 2 print Tuesday and so on for 7 print Sunday.
*/

    public static String CheckDay(int n){
        return switch (n) {
            case 1 -> "Monday Check";
            case 2 -> "Tuesday Check";
            case 3 -> "Wednesday Check";
            case 4 -> "Thursday Check";
            case 5 -> "Friday Check";
            case 6 -> "Saturday Check";
            case 7 -> "Sunday Check";
            default -> "Invalid Check";
        };
    }

    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(CheckDay(n));
    }

}
