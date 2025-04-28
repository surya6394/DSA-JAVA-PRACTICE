package Function;

public class PassByReference {
    public static void printName(String name){
//        name[0] = "N";
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        String str = "Surya";
        printName(str);
    }
}
