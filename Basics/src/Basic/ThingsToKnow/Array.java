package Basic.ThingsToKnow;

public class Array {
    public static void main(String[] args){
        int[] arr = {1,2,3,5,6,6};

        System.out.println(arr[2]);

        // 2D array

        int[][] arr1 = new int[2][5];

        arr1[1][2] = 78;

        System.out.println(arr1[1][2]); // assigned value printed

        System.out.println(arr1[0][4]);  // and others are by default assigned 0.

        String name = "Surya";
        System.out.println(name.charAt(2));
        System.out.println(name.length() - 1);
    }
}
