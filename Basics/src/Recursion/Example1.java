package Recursion;


public class Example1 {
    static int count = 0;
    public static void Counter(){
        int a = 10;
        if(count == 3) return;
        System.out.println(a);
        count++;
        Counter();
    }
    public static void main(String[] args) {
        Counter();
    }
}
