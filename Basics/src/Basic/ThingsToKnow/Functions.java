package Basic.ThingsToKnow;

import BasicExamples.PrintName;

import java.util.Scanner;

class Person {
    String name;
}
public class Functions {

    // In Java, functions are called methods. A method is a block of code that performs a specific task and can be reused.
    // Basic Syntax
    // returnType methodName(parameters) {
    //    // code
    //    return value; // if returnType is not void
    //}

    // Method with no return value
    static void Printname(){
        System.out.println("Surya_rkn");
    }

    // method with parameters
    static void NameWithParameter(String name){
        System.out.println("Hey "+name);
    }

    // Method with return value
    static int PrintNumber(int n){
        return n;
    }

    // method returning string
    static String name(){
        return "Hello Surya";
    }

    // Print Sum of two number with parameter
    static int sum(int a, int b){
        int c = a + b;
        return c;
    }

    // pass by value
    static void passbyvalue(int n){
        System.out.println("Value = "+n);
        n += 5;
        System.out.println("Value = "+n);
        n += 5;
        System.out.println("Value = "+n);
    }

    //pass by reference
    static void passbyreference(Person p){
        p.name = "Surya";
    }

    //array example
    static void modifyArray(int[] arr){
        arr[2] = 100;
    }

    public static void main(String[] args){
        Printname();
        NameWithParameter("Surya");
        System.out.println("Given number is "+ PrintNumber(5));
        System.out.println(name());
        System.out.println("Sum of a and b = "+sum(5,6));


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n = ");
        int n = sc.nextInt();
        passbyvalue(n);
        System.out.println(n);

        Person p = new Person();
        p.name = "Pratap";
        passbyreference(p);
        System.out.println(p.name);

        int[] arr = {1,2,3};
        modifyArray(arr);
        System.out.println(arr[2]);
    }
}
