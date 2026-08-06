package Basic.ThingsToKnow;

import java.util.Scanner;

public class IfElse {

    /*
Take the age from the user and then decide accordingly
1. If age 18, print-> not eligible for job
2. If age >= 18 and age <= 54,
print-> "eligible for job"
3. If age >= 55 and age <= 57,
print-> "eligible for job, but retirement soon."
4. If age 57
print-> "retirement time"
*/

    public static String CheckEligibility(int age){
//        if(age < 18){
//            return "You are not eligible for job.";
//        } else if(age <= 54){
//            return "You are eligible for job.";
//        } else if(age <= 57){
//            return "But retirement soon.";
//        } else{
//            return "retirement time.";
//        }

        if(age < 18){
            return "You are not eligible for job.";
        } else if(age <= 57){
            System.out.println("You are eligible for job.");
            if(age >= 54){
                System.out.println("But retirement soon.");
            }
            return "";
        } else{
            return "retirement time.";
        }
    }
    public static void main(String[] args){

        // Take the age of the user and decide accordingly.

        System.out.println("Enter the age = ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(CheckEligibility(age));

    }
}
