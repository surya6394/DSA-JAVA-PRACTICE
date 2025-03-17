package Collection;

import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {

//        For Search in array
//        int[] num = {1,2,3,4,5,6,7,8,9,10};
//        int index = Arrays.binarySearch(num, 4);
//
//        System.out.println("The index of element 4 in the array is = "+index);


//        For Sort Array
          Integer[] num = {2,5,3,1,7,4,8,6,7,46};
          Arrays.sort(num);

          for(int i : num) {
              System.out.println("Sorted Array is = " + i);

//        Fill or Replace all element with given value
              Arrays.fill(num,8);
              System.out.println("Replaced Arrayes = "+i);
          }
    }
}
