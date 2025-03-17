package Collection;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args){

        Stack<String> str = new Stack<>();

        str.push("Dog");
        str.push("Horse");
        str.push("cat");
        str.push("Cow");

        System.out.println("Array of the animal list:- "+str);
        System.out.println("Top animal = "+ str.peek());
        str.pop();
        System.out.println("Top animal after pop = "+ str.peek());
        System.out.println("Animals count after pop = "+str);
        str.push("Lion");
        System.out.println("Animals element = "+ str);
    }
}
