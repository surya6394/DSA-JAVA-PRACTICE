package BasicExamples;

public class PallindromeString {

    public static void reverseString(String str, String rev){
        for(int i = str.length()-1; i >= 0; i--){
            rev = rev+str.charAt(i);
        }
        if(str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("Pallindrome String.");
        } else{
            System.out.println("Not Pallindrome String.");
        }
    }

    public static void main(String[] args) {
        String str = "MaDam";
        String rev = "";

        reverseString(str, rev);

    }
}
