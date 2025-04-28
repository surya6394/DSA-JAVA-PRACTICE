package Recursion;

public class PalindromeString {

    public static boolean reverseString(String str, int n, int start, int end){

        if(start == n/2){
            return true;
        }
        else if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return reverseString(str, n, start+1, end - 1);
    }

    public static void main(String[] args) {
        String str = "leveL";
        Boolean a = reverseString(str.toLowerCase(), str.length(), 0, str.length()-1);
        if(a == true){
            System.out.println("Given String is Pallindrome.");
        }else{
            System.out.println("String is not Pallindrome.");
        }
    }
}
