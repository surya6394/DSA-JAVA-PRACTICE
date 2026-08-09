package Basic.ThingsToKnow;

public class ForWhileLoop {

    public static void main(String[] args){

        // for loop
        for(int i = 1; i <= 10; i++){
            System.out.println("Surya "+i);
        }

        // while loop
        int i = 0;
        while(i < 10){
            System.out.println("Pratap "+i);
            i++;
        }

        int j = 3;
        do{
            System.out.println(j);
            j++;
        } while(j <= 5);
    }
}
