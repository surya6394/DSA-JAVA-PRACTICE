package BasicExamples;

import java.util.Arrays;

// Reverse Array using an extra Array
public class ReverseArray {
    public static void printReversedArr(int ans[], int n){
        System.out.println("Reversed Array = "+ ans);
        for(int i = 0; i<n; i++){
            System.out.println(ans[i]+" ");
        }
    }
    public static void reverseArray(int arr[], int n){
        int[] ans = new int[n];
        for(int i = n-1; i >= 0; i--){
            ans[n-i-1] = arr[i];
        }
        System.out.println("Print New Array = "+ Arrays.toString(ans));
        printReversedArr(ans,n);
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,4,5};
        reverseArray(arr,n);
    }
}
